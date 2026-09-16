package p000;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: ۦٌٍّؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3788 implements Runnable {

    /* JADX INFO: renamed from: ۥَ */
    public final Object f12579;

    /* JADX INFO: renamed from: ۥْ */
    public final String f12580;

    /* JADX INFO: renamed from: ۥٓ */
    public final Object f12581;

    /* JADX INFO: renamed from: ۥٖ */
    public final Object f12582;

    /* JADX INFO: renamed from: ۦٗ */
    public final Object f12583;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f12584;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f12585 = 1;

    public /* synthetic */ RunnableC3788(String str, InterfaceC2697 interfaceC2697, int i, IOException iOException, byte[] bArr, Map map) {
        this.f12581 = interfaceC2697;
        this.f12584 = i;
        this.f12579 = iOException;
        this.f12582 = bArr;
        this.f12580 = str;
        this.f12583 = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12585) {
            case 0:
                C3610 c3610 = (C3610) this.f12583;
                C4474 c4474 = ((C5371) c3610.f18660).f17713;
                C5371.m9021(c4474);
                if (!c4474.f911) {
                    Log.println(6, c3610.m6441(), "Persisted config not initialized. Not logging error/warn");
                    return;
                }
                if (c3610.f12018 == 0) {
                    C0515 c0515 = ((C5371) c3610.f18660).f17715;
                    if (c0515.f1839 == null) {
                        synchronized (c0515) {
                            try {
                                if (c0515.f1839 == null) {
                                    C5371 c5371 = (C5371) c0515.f18660;
                                    ApplicationInfo applicationInfo = c5371.f17739.getApplicationInfo();
                                    String strM8130 = C4773.m8130();
                                    if (applicationInfo != null) {
                                        String str = applicationInfo.processName;
                                        c0515.f1839 = Boolean.valueOf(str != null && str.equals(strM8130));
                                    }
                                    if (c0515.f1839 == null) {
                                        c0515.f1839 = Boolean.TRUE;
                                        C3610 c3611 = c5371.f17717;
                                        C5371.m9020(c3611);
                                        c3611.f12020.m9432("My process not in the list of running processes");
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (c0515.f1839.booleanValue()) {
                        c3610.f12018 = 'C';
                    } else {
                        c3610.f12018 = 'c';
                    }
                    break;
                }
                long j = c3610.f12019;
                if (j < 0) {
                    ((C5371) c3610.f18660).f17715.m1160();
                    j = 161000;
                    c3610.f12019 = 161000L;
                }
                int i = this.f12584;
                char c = c3610.f12018;
                String str2 = this.f12580;
                Object obj = this.f12581;
                Object obj2 = this.f12579;
                Object obj3 = this.f12582;
                char cCharAt = "01VDIWEA?".charAt(i);
                String strM6439 = C3610.m6439(true, str2, obj, obj2, obj3);
                StringBuilder sb = new StringBuilder(String.valueOf(cCharAt).length() + 1 + String.valueOf(c).length() + String.valueOf(j).length() + 1 + strM6439.length());
                sb.append("2");
                sb.append(cCharAt);
                sb.append(c);
                sb.append(j);
                sb.append(":");
                sb.append(strM6439);
                String string = sb.toString();
                if (string.length() > 1024) {
                    string = str2.substring(0, 1024);
                }
                C3250 c3250 = c4474.f14755;
                if (c3250 != null) {
                    C4474 c4475 = (C4474) c3250.f10915;
                    c4475.mo6517();
                    if (((C4474) c3250.f10915).m7755().getLong("health_monitor:start", 0L) == 0) {
                        c3250.m5970();
                    }
                    long j2 = c4475.m7755().getLong("health_monitor:count", 0L);
                    if (j2 <= 0) {
                        SharedPreferences.Editor editorEdit = c4475.m7755().edit();
                        editorEdit.putString("health_monitor:value", string);
                        editorEdit.putLong("health_monitor:count", 1L);
                        editorEdit.apply();
                        return;
                    }
                    C1512 c1512 = ((C5371) c4475.f18660).f17721;
                    C5371.m9021(c1512);
                    long jNextLong = c1512.m3244().nextLong() & Long.MAX_VALUE;
                    long j3 = j2 + 1;
                    long j4 = Long.MAX_VALUE / j3;
                    SharedPreferences.Editor editorEdit2 = c4475.m7755().edit();
                    if (jNextLong < j4) {
                        editorEdit2.putString("health_monitor:value", string);
                    }
                    editorEdit2.putLong("health_monitor:count", j3);
                    editorEdit2.apply();
                    return;
                }
                return;
            default:
                ((InterfaceC2697) this.f12581).mo5024(this.f12580, this.f12584, (Throwable) this.f12579, (byte[]) this.f12582, (Map) this.f12583);
                return;
        }
    }

    public RunnableC3788(C3610 c3610, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f12584 = i;
        this.f12580 = str;
        this.f12581 = obj;
        this.f12579 = obj2;
        this.f12582 = obj3;
        this.f12583 = c3610;
    }
}
