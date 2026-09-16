package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ۦٌّؗ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3743 implements InterfaceC1170, InterfaceC3077 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final Object f12466;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f12467;

    public C3743(BinderC0222 binderC0222, byte[] bArr) {
        this.f12467 = 1;
        this.f12466 = bArr;
    }

    @Override // p000.InterfaceC1170
    public void accept(Object obj, Object obj2) {
        C3663 c3663 = (C3663) ((C5390) obj).m7333();
        BinderC0222 binderC0222 = new BinderC0222((C1543) this.f12466, (C2332) obj2);
        Parcel parcelM7504 = c3663.m7504();
        AbstractC5564.m9344(parcelM7504, binderC0222);
        c3663.m7505(parcelM7504, 27);
    }

    @Override // p000.InterfaceC3077
    public Object get() {
        int i = this.f12467;
        Object obj = this.f12466;
        switch (i) {
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                Context context = (Context) ((C2813) obj).f9393;
                Object obj2 = C0996.f3556;
                try {
                    ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.google.android.gms", 0);
                    applicationInfo.getClass();
                    return new C4152(applicationInfo);
                } catch (PackageManager.NameNotFoundException unused) {
                    return C0034.f6711;
                }
            default:
                ScheduledExecutorServiceC3499 scheduledExecutorServiceC3499 = (ScheduledExecutorServiceC3499) ((InterfaceC3077) obj).get();
                scheduledExecutorServiceC3499.getClass();
                RunnableFutureC1595 runnableFutureC1595 = new RunnableFutureC1595(CallableC0256.f955);
                return new ScheduledFutureC2832(runnableFutureC1595, scheduledExecutorServiceC3499.f11603.schedule(runnableFutureC1595, 10000L, TimeUnit.MILLISECONDS));
        }
    }

    /* JADX INFO: renamed from: ۥؗ */
    public void m6580(long j, long j2) {
        C4423 c4423 = (C4423) this.f12466;
        c4423.mo6517();
        c4423.m7719();
        C5371 c5371 = (C5371) c4423.f18660;
        C4474 c4474 = c5371.f17713;
        C5371.m9021(c4474);
        if (c4474.m7751(j)) {
            C5371.m9021(c4474);
            c4474.f14753.m8174(true);
            c5371.m9029().m3857();
        }
        C5371.m9021(c4474);
        c4474.f14772.m7370(j);
        if (c4474.f14753.m8175()) {
            m6581(j, j2);
        }
    }

    /* JADX INFO: renamed from: ۥُ */
    public void m6581(long j, long j2) {
        C4423 c4423 = (C4423) this.f12466;
        c4423.mo6517();
        C5371 c5371 = (C5371) c4423.f18660;
        if (c5371.m9024()) {
            C4474 c4474 = c5371.f17713;
            C5371.m9021(c4474);
            c4474.f14772.m7370(j);
            c5371.f17719.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C3610 c3610 = c5371.f17717;
            C5371.m9020(c3610);
            c3610.f12023.m9430(Long.valueOf(jElapsedRealtime), "Session started, time");
            long j3 = j / 1000;
            Long lValueOf = Long.valueOf(j3);
            C5235 c5235 = c5371.f17709;
            C5371.m9023(c5235);
            c5235.m8874(j, lValueOf, "auto", "_sid");
            C5371.m9021(c4474);
            c4474.f14758.m7370(j3);
            c4474.f14753.m8174(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j3);
            C5371.m9023(c5235);
            c5235.m8869(j, j2, bundle, "auto", "_s");
            String strM2974 = c4474.f14766.m2974();
            if (TextUtils.isEmpty(strM2974)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strM2974);
            C5371.m9023(c5235);
            c5235.m8869(j, j2, bundle2, "auto", "_ssr");
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public boolean m6582() {
        if (!m6586()) {
            return false;
        }
        C5371 c5371 = (C5371) this.f12466;
        c5371.f17719.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C4474 c4474 = c5371.f17713;
        C5371.m9021(c4474);
        return jCurrentTimeMillis - c4474.f14770.m7371() > c5371.f17715.m1159(null, AbstractC4936.f16336);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public void m6583(int i, String str, List list, boolean z, boolean z2) {
        C5590 c5590;
        C5371 c5371 = (C5371) ((C3040) this.f12466).f18660;
        int i2 = i - 1;
        if (i2 == 0) {
            C3610 c3610 = c5371.f17717;
            C5371.m9020(c3610);
            c5590 = c3610.f12015;
        } else if (i2 != 1) {
            if (i2 == 3) {
                C3610 c3611 = c5371.f17717;
                C5371.m9020(c3611);
                c5590 = c3611.f12023;
            } else if (i2 != 4) {
                C3610 c3612 = c5371.f17717;
                C5371.m9020(c3612);
                c5590 = c3612.f12016;
            } else if (z) {
                C3610 c3613 = c5371.f17717;
                C5371.m9020(c3613);
                c5590 = c3613.f12024;
            } else if (z2) {
                C3610 c3614 = c5371.f17717;
                C5371.m9020(c3614);
                c5590 = c3614.f12022;
            } else {
                C3610 c3615 = c5371.f17717;
                C5371.m9020(c3615);
                c5590 = c3615.f12021;
            }
        } else if (z) {
            C3610 c3616 = c5371.f17717;
            C5371.m9020(c3616);
            c5590 = c3616.f12025;
        } else if (z2) {
            C3610 c3617 = c5371.f17717;
            C5371.m9020(c3617);
            c5590 = c3617.f12020;
        } else {
            C3610 c3618 = c5371.f17717;
            C5371.m9020(c3618);
            c5590 = c3618.f12026;
        }
        int size = list.size();
        if (size == 1) {
            c5590.m9430(list.get(0), str);
            return;
        }
        if (size == 2) {
            c5590.m9434(list.get(0), list.get(1), str);
        } else if (size != 3) {
            c5590.m9432(str);
        } else {
            c5590.m9431(str, list.get(0), list.get(1), list.get(2));
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public void m6584() {
        C4423 c4423 = (C4423) this.f12466;
        c4423.mo6517();
        C5371 c5371 = (C5371) c4423.f18660;
        C4474 c4474 = c5371.f17713;
        C5371.m9021(c4474);
        c5371.f17719.getClass();
        if (c4474.m7751(System.currentTimeMillis())) {
            C4474 c4475 = c5371.f17713;
            C5371.m9021(c4475);
            c4475.f14753.m8174(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                C3610 c3610 = c5371.f17717;
                C5371.m9020(c3610);
                c3610.f12023.m9432("Detected application was in foreground");
                m6581(System.currentTimeMillis(), c5371.f17715.m1162(null, AbstractC4936.f19565) ? SystemClock.elapsedRealtime() : 0L);
            }
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public void m6585(String str, Bundle bundle) {
        String string;
        C5371 c5371 = (C5371) this.f12466;
        C3644 c3644 = c5371.f17733;
        C4474 c4474 = c5371.f17713;
        C5371.m9020(c3644);
        c3644.mo6517();
        if (c5371.m9024()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        C5371.m9021(c4474);
        c4474.f14768.m2971(string);
        C4173 c4173 = c4474.f14770;
        c5371.f17719.getClass();
        c4173.m7370(System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: ۦۙ */
    public boolean m6586() {
        C4474 c4474 = ((C5371) this.f12466).f17713;
        C5371.m9021(c4474);
        return c4474.f14770.m7371() > 0;
    }

    public /* synthetic */ C3743(int i, Object obj) {
        this.f12467 = i;
        this.f12466 = obj;
    }
}
