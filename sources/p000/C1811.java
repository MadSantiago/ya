package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: ۥٜؒٚٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1811 {

    /* JADX INFO: renamed from: ۦٛ */
    public static final String f6028 = C1984.m3875("WorkContinuationImpl");

    /* JADX INFO: renamed from: ۥؗ */
    public final int f6029;

    /* JADX INFO: renamed from: ۥُ */
    public final ArrayList f6030;

    /* JADX INFO: renamed from: ۥّ */
    public final ArrayList f6031 = new ArrayList();

    /* JADX INFO: renamed from: ۥۗ */
    public final String f6032;

    /* JADX INFO: renamed from: ۥۜ */
    public C2796 f6033;

    /* JADX INFO: renamed from: ۥۣ */
    public final C3600 f6034;

    /* JADX INFO: renamed from: ۦؑ */
    public final List f6035;

    /* JADX INFO: renamed from: ۦۙ */
    public boolean f6036;

    public C1811(C3600 c3600, String str, int i, List list, int i2) {
        this.f6034 = c3600;
        this.f6032 = str;
        this.f6029 = i;
        this.f6035 = list;
        this.f6030 = new ArrayList(list.size());
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (i == 1 && ((AbstractC3104) list.get(i3)).f10406.f13793 != Long.MAX_VALUE) {
                C1078.m2272("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
                throw null;
            }
            String string = ((AbstractC3104) list.get(i3)).f10407.toString();
            this.f6030.add(string);
            this.f6031.add(string);
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static HashSet m3591(C1811 c1811) {
        HashSet hashSet = new HashSet();
        c1811.getClass();
        return hashSet;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C2796 m3592() {
        String str;
        if (this.f6036) {
            C1984.m3874().m3885(f6028, "Already enqueued work ids (" + TextUtils.join(", ", this.f6030) + ")");
        } else {
            C3600 c3600 = this.f6034;
            C4992 c4992 = (C4992) c3600.f11989.f9392;
            int i = this.f6029;
            if (i == 1) {
                str = "REPLACE";
            } else if (i == 2) {
                str = "KEEP";
            } else if (i == 3) {
                str = "APPEND";
            } else {
                if (i != 4) {
                    throw null;
                }
                str = "APPEND_OR_REPLACE";
            }
            this.f6033 = AbstractC2774.m5184(c4992, "EnqueueRunnable_".concat(str), (ExecutorC2205) c3600.f11992.f5059, new C0463(15, this));
        }
        return this.f6033;
    }
}
