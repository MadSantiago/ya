package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.UserHandle;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: renamed from: ۦَّؒؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4006 implements Serializable {

    /* JADX INFO: renamed from: ۥَ */
    public final String f13350;

    /* JADX INFO: renamed from: ۥْ */
    public final String f13351;

    /* JADX INFO: renamed from: ۥٓ */
    public final String f13352;

    /* JADX INFO: renamed from: ۥٖ */
    public final int f13353;

    /* JADX INFO: renamed from: ۥۖ */
    public boolean f13354;

    /* JADX INFO: renamed from: ۦٗ */
    public final String f13355;

    /* JADX INFO: renamed from: ۦۛ */
    public final Throwable f13356;

    /* JADX INFO: renamed from: ۦ۟ */
    public final String f13357;

    /* JADX INFO: renamed from: ۦۨ */
    public final long f13358;

    public C4006(String str, String str2, String str3, Throwable th, int i) {
        String strM3847;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Integer num;
        str = (i & 4) != 0 ? AbstractC3801.f12618 : str;
        this.f13358 = 0L;
        this.f13357 = "";
        this.f13351 = str;
        this.f13352 = str2;
        this.f13350 = "";
        int iIntValue = 0;
        this.f13353 = 0;
        this.f13355 = str3;
        this.f13356 = th;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f13358 = jCurrentTimeMillis;
        this.f13357 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.ROOT).format(new Date(jCurrentTimeMillis));
        if (C0113.m208() && C0113.f444) {
            strM3847 = "android-zygote";
        } else {
            C1967.f6501.getClass();
            strM3847 = C1967.m3847();
        }
        this.f13350 = strM3847;
        C1967.f6501.getClass();
        String strM3848 = C1967.m3847();
        Context contextM3851 = C1967.m3851();
        if (contextM3851 != null && (packageManager = contextM3851.getPackageManager()) != null && (applicationInfo = packageManager.getApplicationInfo(strM3848, 1)) != null) {
            int i2 = applicationInfo.uid;
            C4229 c4229 = new C4229(AbstractC5041.m8557(UserHandle.class).f10543, null, 1);
            C2432 c2432 = C1940.f6401;
            c4229.f14027 = AbstractC3925.m7053();
            c4229.f14028 = 3;
            C2244 c2244 = new C2244();
            c2244.f9028 = c4229;
            c2244.f9027 = "getUserId";
            c2244.f7447.addAll(Arrays.asList(Arrays.copyOf(new Object[]{AbstractC5041.m8557(Integer.TYPE)}, 1)));
            C3657 c3657 = (C3657) AbstractC0973.m2058(c2244.m4293());
            if (c3657 != null && (num = (Integer) c3657.m6535(Integer.valueOf(i2))) != null) {
                iIntValue = num.intValue();
            }
        }
        this.f13353 = iIntValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4006)) {
            return false;
        }
        C4006 c4006 = (C4006) obj;
        return this.f13358 == c4006.f13358 && AbstractC3831.m6874(this.f13357, c4006.f13357) && AbstractC3831.m6874(this.f13351, c4006.f13351) && AbstractC3831.m6874(this.f13352, c4006.f13352) && AbstractC3831.m6874(this.f13350, c4006.f13350) && this.f13353 == c4006.f13353 && AbstractC3831.m6874(this.f13355, c4006.f13355) && AbstractC3831.m6874(this.f13356, c4006.f13356);
    }

    public final int hashCode() {
        int iM8674 = AbstractC5078.m8674(AbstractC2049.m3999(this.f13353, AbstractC5078.m8674(AbstractC5078.m8674(AbstractC5078.m8674(AbstractC5078.m8674(Long.hashCode(this.f13358) * 31, 31, this.f13357), 31, this.f13351), 31, this.f13352), 31, this.f13350), 31), 31, this.f13355);
        Throwable th = this.f13356;
        return iM8674 + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        int i;
        String str = "";
        for (Integer num : AbstractC3801.f12621) {
            int iIntValue = num.intValue();
            if (iIntValue == 1000) {
                str = ((Object) str) + "[" + this.f13351 + "]";
            }
            if (iIntValue == 1001) {
                str = ((Object) str) + "[" + this.f13352 + "]";
            }
            if (iIntValue == 1002 && !this.f13354) {
                String str2 = this.f13350;
                if (!AbstractC0684.m1534(str2)) {
                    str = ((Object) str) + "[" + str2 + "]";
                }
            }
            if (iIntValue == 1003 && !this.f13354 && (i = this.f13353) != 0) {
                str = ((Object) str) + "[" + i + "]";
            }
        }
        String str3 = !AbstractC0684.m1534(str) ? str : null;
        String str4 = this.f13355;
        if (str3 == null) {
            return str4;
        }
        return ((Object) str) + " " + str4;
    }
}
