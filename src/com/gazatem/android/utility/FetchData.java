package com.gazatem.android.utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import android.os.StrictMode;

public class FetchData {

	private static String fetchJsonFromUrl(String sourceUrl) throws IOException {

		if (android.os.Build.VERSION.SDK_INT > 9) {
			StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
					.permitAll().build();
			StrictMode.setThreadPolicy(policy);
		}

		HttpURLConnection urlConnection = null;
		URL url;
		BufferedReader reader = null;
		String jsonData = null;

		try {
			url = new URL(sourceUrl);

			urlConnection = (HttpURLConnection) url.openConnection();
			urlConnection.setRequestMethod("GET");
			urlConnection.connect();

			InputStream inputStream = urlConnection.getInputStream();
			StringBuffer buffer = new StringBuffer();
			if (inputStream == null) {
				// Nothing to do.

			}
			reader = new BufferedReader(new InputStreamReader(inputStream));

			String line;
			while ((line = reader.readLine()) != null) {
				// Since it's JSON, adding a newline isn't necessary (it won't
				// affect parsing)
				// But it does make debugging a *lot* easier if you print out
				// the completed
				// buffer for debugging.
				buffer.append(line + "\n");
			}
			jsonData = buffer.toString();
		} catch (IOException e) {

		} finally {
			if (urlConnection != null) {
				urlConnection.disconnect();
			}
			if (reader != null) {
				try {
					reader.close();
				} catch (final IOException e) {

				}
			}
		}

		return jsonData;
	}
}
