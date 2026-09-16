package p000;

import android.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: ۥٙؒۢؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1640 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final Charset f5482 = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: ۥۣ */
    public final C2711 f5483;

    public C1640(C2711 c2711) {
        this.f5483 = c2711;
    }

    /* JADX INFO: renamed from: ۥُ */
    public static String m3450(List list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            try {
                jSONArray.put(new JSONObject(AbstractC3146.f10617.m8700(list.get(i))));
            } catch (JSONException e) {
                Log.w("FirebaseCrashlytics", "Exception parsing rollout assignment!", e);
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    /* JADX INFO: renamed from: ۥّ */
    public static void m3451(File file) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", "Deleted corrupt file: " + file.getAbsolutePath(), null);
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static ArrayList m3452(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            try {
                arrayList.add(AbstractC3146.m5828(string));
            } catch (Exception e) {
                Log.w("FirebaseCrashlytics", "Failed de-serializing rollouts state. " + string, e);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static HashMap m3453(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = null;
            if (!jSONObject.isNull(next)) {
                strOptString = jSONObject.optString(next, null);
            }
            map.put(next, strOptString);
        }
        return map;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static void m3454(File file, String str) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", "Deleted corrupt file: " + file.getAbsolutePath() + "\nReason: " + str, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r8v4, types: [int] */
    /* JADX INFO: renamed from: ۥؗ */
    public final Map m3455(String str, boolean z) throws Throwable {
        ?? r8;
        FileInputStream fileInputStream;
        Exception e;
        C2711 c2711 = this.f5483;
        File fileM5036 = z ? c2711.m5036(str, "internal-keys") : c2711.m5036(str, "keys");
        if (!fileM5036.exists() || fileM5036.length() == 0) {
            m3454(fileM5036, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_MAP;
        }
        ?? r7 = 0;
        try {
            try {
                fileInputStream = new FileInputStream(fileM5036);
                try {
                    HashMap mapM3453 = m3453(AbstractC2133.m4151(fileInputStream));
                    AbstractC2133.m4138(fileInputStream, "Failed to close user metadata file.");
                    return mapM3453;
                } catch (Exception e2) {
                    e = e2;
                    Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                    m3451(fileM5036);
                    AbstractC2133.m4138(fileInputStream, "Failed to close user metadata file.");
                    return Collections.EMPTY_MAP;
                }
            } catch (Exception e3) {
                fileInputStream = null;
                e = e3;
            } catch (Throwable th) {
                th = th;
                AbstractC2133.m4138(r7, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            r7 = r8;
            AbstractC2133.m4138(r7, "Failed to close user metadata file.");
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final void m3456(String str, Map map, boolean z) throws Throwable {
        BufferedWriter bufferedWriter;
        Exception e;
        C2711 c2711 = this.f5483;
        File fileM5036 = z ? c2711.m5036(str, "internal-keys") : c2711.m5036(str, "keys");
        BufferedWriter bufferedWriter2 = null;
        try {
            String string = new JSONObject(map).toString();
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileM5036), f5482));
            try {
                try {
                    bufferedWriter.write(string);
                    bufferedWriter.flush();
                    AbstractC2133.m4138(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter2 = bufferedWriter;
                    AbstractC2133.m4138(bufferedWriter2, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                Log.w("FirebaseCrashlytics", "Error serializing key/value metadata.", e);
                m3451(fileM5036);
                AbstractC2133.m4138(bufferedWriter, "Failed to close key/value metadata file.");
            }
        } catch (Exception e3) {
            bufferedWriter = null;
            e = e3;
        } catch (Throwable th2) {
            th = th2;
            AbstractC2133.m4138(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Closeable] */
    /* JADX INFO: renamed from: ۦؑ */
    public final String m3457(String str) {
        FileInputStream fileInputStream;
        File fileM5036 = this.f5483.m5036(str, "user-data");
        ?? r5 = 0;
        if (fileM5036.exists()) {
            ?? r2 = (fileM5036.length() > 0L ? 1 : (fileM5036.length() == 0L ? 0 : -1));
            try {
                if (r2 != 0) {
                    try {
                        fileInputStream = new FileInputStream(fileM5036);
                        try {
                            JSONObject jSONObject = new JSONObject(AbstractC2133.m4151(fileInputStream));
                            String strOptString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", null) : null;
                            String str2 = "Loaded userId " + strOptString + " for session " + str;
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str2, null);
                            }
                            AbstractC2133.m4138(fileInputStream, "Failed to close user metadata file.");
                            return strOptString;
                        } catch (Exception e) {
                            e = e;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                            m3451(fileM5036);
                            AbstractC2133.m4138(fileInputStream, "Failed to close user metadata file.");
                            return null;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        fileInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        AbstractC2133.m4138(r5, "Failed to close user metadata file.");
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r5 = r2;
            }
        }
        String strM6628 = AbstractC3761.m6628("No userId set for session ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strM6628, null);
        }
        m3451(fileM5036);
        return null;
    }
}
