package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: ۥۨؓؒ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2914 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C0154 f9711;

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC2090 f9712;

    /* JADX INFO: renamed from: ۥۣ */
    public final Context f9713;

    /* JADX INFO: renamed from: ۦؑ */
    public static final Pattern f9710 = Pattern.compile("[0-9]+s");

    /* JADX INFO: renamed from: ۥُ */
    public static final Charset f9709 = Charset.forName("UTF-8");

    public C2914(Context context, InterfaceC2090 interfaceC2090) {
        this.f9713 = context;
        this.f9712 = interfaceC2090;
        C0154 c0154 = new C0154();
        C4452 c4452 = C4452.f14692;
        if (c4452 == null) {
            Pattern pattern = C2761.f9143;
            c4452 = new C4452(0);
            C4452.f14692 = c4452;
        }
        if (C2761.f9142 == null) {
            C2761.f9142 = new C2761(c4452);
        }
        this.f9711 = c0154;
    }

    /* JADX INFO: renamed from: ۥُ */
    public static C2931 m5489(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f9709));
        byte b = (byte) (0 | 1);
        jsonReader.beginObject();
        long jM5494 = 0;
        String strNextString = null;
        String strNextString2 = null;
        String strNextString3 = null;
        String strNextString4 = null;
        C1969 c1969 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("name")) {
                strNextString2 = jsonReader.nextString();
            } else if (strNextName.equals("fid")) {
                strNextString3 = jsonReader.nextString();
            } else if (strNextName.equals("refreshToken")) {
                strNextString4 = jsonReader.nextString();
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals("token")) {
                        strNextString = jsonReader.nextString();
                    } else if (strNextName2.equals("expiresIn")) {
                        jM5494 = m5494(jsonReader.nextString());
                        b = (byte) (b | 1);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                if (b != 1) {
                    C1078.m2276("Missing required properties: tokenExpirationTimestamp");
                    return null;
                }
                c1969 = new C1969(jM5494, strNextString, 0);
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new C2931(strNextString2, strNextString3, strNextString4, c1969, 1);
    }

    /* JADX INFO: renamed from: ۥّ */
    public static C1969 m5490(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f9709));
        byte b = (byte) (0 | 1);
        jsonReader.beginObject();
        long jM5494 = 0;
        String strNextString = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("token")) {
                strNextString = jsonReader.nextString();
            } else if (strNextName.equals("expiresIn")) {
                jM5494 = m5494(jsonReader.nextString());
                b = (byte) (b | 1);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        if (b == 1) {
            return new C1969(jM5494, strNextString, 1);
        }
        C1078.m2276("Missing required properties: tokenExpirationTimestamp");
        return null;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static void m5491(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f9709));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
            } catch (IOException unused) {
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        Log.w("Firebase-Installations", str4);
        Log.w("Firebase-Installations", "Firebase options used while communicating with Firebase server APIs: " + str2 + ", " + str3 + (TextUtils.isEmpty(str) ? "" : AbstractC3761.m6628(", ", str)));
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static void m5492(HttpURLConnection httpURLConnection) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:19.1.2");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            m5495(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static URL m5493(String str) {
        try {
            return new URL("https://firebaseinstallations.googleapis.com/v1/".concat(str));
        } catch (MalformedURLException e) {
            throw new C5707(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static long m5494(String str) {
        AbstractC0487.m1079("Invalid Expiration Timestamp.", f9710.matcher(str).matches());
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static void m5495(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream == null) {
            C5028.m8448("Cannot send request to FIS servers. No OutputStream available.");
            return;
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static void m5496(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:19.1.2");
            m5495(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a2  */
    /* JADX INFO: renamed from: ۥؗ */
    public final HttpURLConnection m5497(URL url, String str) {
        byte[] bArrDigest;
        MessageDigest messageDigest;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            Context context = this.f9713;
            httpURLConnection.addRequestProperty("X-Android-Package", context.getPackageName());
            InterfaceC0985 interfaceC0985 = (InterfaceC0985) this.f9712.get();
            if (interfaceC0985 != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) AbstractC5378.m9055(((C0161) interfaceC0985).m344()));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e);
                } catch (ExecutionException e2) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e2);
                }
            }
            String string = null;
            try {
                PackageInfo packageInfoM564 = C3866.m6899(context).m564(64, context.getPackageName());
                Signature[] signatureArr = packageInfoM564.signatures;
                if (signatureArr == null || signatureArr.length != 1) {
                    bArrDigest = null;
                } else {
                    int i = 0;
                    while (true) {
                        if (i >= 2) {
                            messageDigest = null;
                            break;
                        }
                        try {
                            messageDigest = MessageDigest.getInstance("SHA1");
                            if (messageDigest != null) {
                                break;
                            }
                            i++;
                        } catch (NoSuchAlgorithmException unused) {
                        }
                    }
                    if (messageDigest == null) {
                        bArrDigest = null;
                    } else {
                        bArrDigest = messageDigest.digest(packageInfoM564.signatures[0].toByteArray());
                    }
                }
                if (bArrDigest == null) {
                    Log.e("ContentValues", "Could not get fingerprint hash for package: " + context.getPackageName());
                } else {
                    int length = bArrDigest.length;
                    StringBuilder sb = new StringBuilder(length + length);
                    for (int i2 = 0; i2 < length; i2++) {
                        char[] cArr = AbstractC3831.f12707;
                        sb.append(cArr[(bArrDigest[i2] & 240) >>> 4]);
                        sb.append(cArr[bArrDigest[i2] & 15]);
                    }
                    string = sb.toString();
                }
            } catch (PackageManager.NameNotFoundException e3) {
                Log.e("ContentValues", "No such package: " + context.getPackageName(), e3);
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", string);
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused2) {
            throw new C5707("Firebase Installations Service is unavailable. Please try again later.");
        }
    }
}
