package p000;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: renamed from: ۦُْؑۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3883 implements Runnable {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ Object f12983;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f12984;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ long f12985;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ Object f12986;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f12987;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f12988;

    public RunnableC3883(C5266 c5266, Bundle bundle, C0932 c0932, C0932 c0933, long j) {
        this.f12988 = 2;
        this.f12987 = bundle;
        this.f12984 = c0932;
        this.f12983 = c0933;
        this.f12985 = j;
        Objects.requireNonNull(c5266);
        this.f12986 = c5266;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f12988;
        Object obj = this.f12983;
        Object obj2 = this.f12984;
        Object obj3 = this.f12986;
        Object obj4 = this.f12987;
        switch (i) {
            case 0:
                String str = (String) obj2;
                C5034 c5034 = ((BinderC5179) obj3).f17131;
                String str2 = (String) obj4;
                if (str2 != null) {
                    C0932 c0932 = new C0932(this.f12985, (String) obj, str2);
                    c5034.mo2406().mo6517();
                    String str3 = c5034.f16680;
                    if (str3 != null) {
                        str3.equals(str);
                    }
                    c5034.f16680 = str;
                    c5034.f16677 = c0932;
                } else {
                    c5034.mo2406().mo6517();
                    String str4 = c5034.f16680;
                    if (str4 == null || str4.equals(str)) {
                        c5034.f16680 = str;
                        c5034.f16677 = null;
                    }
                }
                break;
            case 1:
                C5235 c5235 = (C5235) obj3;
                String str5 = (String) obj4;
                String str6 = (String) obj2;
                c5235.m8874(this.f12985, this.f12983, str5, str6);
                break;
            default:
                Bundle bundle = (Bundle) obj4;
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                C5266 c5266 = (C5266) obj3;
                C1512 c1512 = ((C5371) c5266.f18660).f17721;
                C5371.m9021(c1512);
                c5266.m8900((C0932) obj2, (C0932) obj, this.f12985, true, c1512.m3202("screen_view", bundle, null, false));
                break;
        }
    }

    public /* synthetic */ RunnableC3883(Object obj, String str, String str2, Object obj2, long j, int i) {
        this.f12988 = i;
        this.f12987 = str;
        this.f12984 = str2;
        this.f12983 = obj2;
        this.f12985 = j;
        this.f12986 = obj;
    }
}
