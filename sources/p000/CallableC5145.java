package p000;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: ۦؚۙۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC5145 implements Callable {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C0161 f17041;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f17042;

    public /* synthetic */ CallableC5145(C0161 c0161, int i) {
        this.f17042 = i;
        this.f17041 = c0161;
    }

    /* JADX INFO: renamed from: ۥۣ */
    private final Object m8750() {
        String string;
        C0161 c0161 = this.f17041;
        synchronized (c0161) {
            try {
                C3134 c3134 = (C3134) c0161.f615.get();
                ArrayList arrayListM5816 = c3134.m5816();
                synchronized (c3134) {
                }
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < arrayListM5816.size(); i++) {
                    C4091 c4091 = (C4091) arrayListM5816.get(i);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", c4091.f13660);
                    jSONObject.put("dates", new JSONArray((Collection) c4091.f13659));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString("UTF-8");
                    } catch (Throwable th) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        base64OutputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        return string;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        switch (this.f17042) {
            case 0:
                return m8750();
            default:
                C0161 c0161 = this.f17041;
                synchronized (c0161) {
                    C3134 c3134 = (C3134) c0161.f615.get();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C2239 c2239 = (C2239) c0161.f612.get();
                    C4228 c4228 = c2239.f7412;
                    synchronized (((HashSet) c4228.f14025)) {
                        setUnmodifiableSet = Collections.unmodifiableSet((HashSet) c4228.f14025);
                        break;
                    }
                    boolean zIsEmpty = setUnmodifiableSet.isEmpty();
                    String string = c2239.f7413;
                    if (!zIsEmpty) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(string);
                        sb.append(' ');
                        synchronized (((HashSet) c4228.f14025)) {
                            setUnmodifiableSet2 = Collections.unmodifiableSet((HashSet) c4228.f14025);
                            break;
                        }
                        sb.append(C2239.m4288(setUnmodifiableSet2));
                        string = sb.toString();
                    }
                    synchronized (c3134) {
                        String strM5815 = C3134.m5815(jCurrentTimeMillis);
                        C3637 c3637 = new C3637(string);
                    }
                }
                return null;
        }
    }
}
