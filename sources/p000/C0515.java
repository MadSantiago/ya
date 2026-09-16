package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: ۥؘؖؒؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0515 extends AbstractC5676 {

    /* JADX INFO: renamed from: ۥَ */
    public Boolean f1839;

    /* JADX INFO: renamed from: ۥْ */
    public String f1840;

    /* JADX INFO: renamed from: ۥٓ */
    public InterfaceC1681 f1841;

    /* JADX INFO: renamed from: ۦ۟ */
    public Boolean f1842;

    /* JADX INFO: renamed from: ۥؓ */
    public final double m1152(String str, C2462 c2462) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) c2462.m4592(null)).doubleValue();
        }
        String strMo3507 = this.f1841.mo3507(str, c2462.f8223);
        if (TextUtils.isEmpty(strMo3507)) {
            return ((Double) c2462.m4592(null)).doubleValue();
        }
        try {
            return ((Double) c2462.m4592(Double.valueOf(Double.parseDouble(strMo3507)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) c2462.m4592(null)).doubleValue();
        }
    }

    /* JADX INFO: renamed from: ۥؖ */
    public final int m1153(String str, C2462 c2462) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) c2462.m4592(null)).intValue();
        }
        String strMo3507 = this.f1841.mo3507(str, c2462.f8223);
        if (TextUtils.isEmpty(strMo3507)) {
            return ((Integer) c2462.m4592(null)).intValue();
        }
        try {
            return ((Integer) c2462.m4592(Integer.valueOf(Integer.parseInt(strMo3507)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) c2462.m4592(null)).intValue();
        }
    }

    /* JADX INFO: renamed from: ۥً */
    public final Bundle m1154() {
        C5371 c5371 = (C5371) this.f18660;
        try {
            Context context = c5371.f17739;
            C3610 c3610 = c5371.f17717;
            if (context.getPackageManager() == null) {
                C5371.m9020(c3610);
                c3610.f12020.m9432("Failed to load metadata: PackageManager is null");
                return null;
            }
            C0272 c0272M6899 = C3866.m6899(context);
            ApplicationInfo applicationInfo = c0272M6899.f972.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null) {
                return applicationInfo.metaData;
            }
            C5371.m9020(c3610);
            c3610.f12020.m9432("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            C3610 c3611 = c5371.f17717;
            C5371.m9020(c3611);
            c3611.f12020.m9430(e, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥَ */
    public final boolean m1155(String str) {
        return "1".equals(this.f1841.mo3507(str, "measurement.event_sampling_enabled"));
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final boolean m1156(String str) {
        C5371.m9021(((C5371) this.f18660).f17721);
        if (C1512.m3192((String) AbstractC4936.f19571.m4592(null), str) || C1512.m3192((String) AbstractC4936.f19564.m4592(null), str) || C1512.m3192((String) AbstractC4936.f19566.m4592(null), str)) {
            return true;
        }
        return "1".equals(this.f1841.mo3507(str, "gaia_collection_enabled"));
    }

    /* JADX INFO: renamed from: ۥٕ */
    public final boolean m1157() {
        ((C5371) this.f18660).getClass();
        Boolean boolM1166 = m1166("firebase_analytics_collection_deactivated");
        return boolM1166 != null && boolM1166.booleanValue();
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final boolean m1158() {
        Boolean boolM1166 = this.f1842;
        if (boolM1166 == null) {
            boolM1166 = m1166("app_measurement_lite");
            this.f1842 = boolM1166;
            if (boolM1166 == null) {
                boolM1166 = Boolean.FALSE;
                this.f1842 = boolM1166;
            }
        }
        return boolM1166.booleanValue() || !((C5371) this.f18660).f17737;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final long m1159(String str, C2462 c2462) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) c2462.m4592(null)).longValue();
        }
        String strMo3507 = this.f1841.mo3507(str, c2462.f8223);
        if (TextUtils.isEmpty(strMo3507)) {
            return ((Long) c2462.m4592(null)).longValue();
        }
        try {
            return ((Long) c2462.m4592(Long.valueOf(Long.parseLong(strMo3507)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) c2462.m4592(null)).longValue();
        }
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final void m1160() {
        ((C5371) this.f18660).getClass();
    }

    /* JADX INFO: renamed from: ۥۙ */
    public final boolean m1161() {
        Boolean boolM1166 = m1166("google_analytics_automatic_screen_reporting_enabled");
        return boolM1166 == null || boolM1166.booleanValue();
    }

    /* JADX INFO: renamed from: ۥۧ */
    public final boolean m1162(String str, C2462 c2462) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) c2462.m4592(null)).booleanValue();
        }
        String strMo3507 = this.f1841.mo3507(str, c2462.f8223);
        return TextUtils.isEmpty(strMo3507) ? ((Boolean) c2462.m4592(null)).booleanValue() : ((Boolean) c2462.m4592(Boolean.valueOf("1".equals(strMo3507)))).booleanValue();
    }

    /* JADX INFO: renamed from: ۦؙ */
    public final EnumC3687 m1163(String str, boolean z) {
        Object obj;
        AbstractC0487.m1090(str);
        C5371 c5371 = (C5371) this.f18660;
        Bundle bundleM1154 = m1154();
        if (bundleM1154 == null) {
            C3610 c3610 = c5371.f17717;
            C5371.m9020(c3610);
            c3610.f12020.m9432("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleM1154.get(str);
        }
        EnumC3687 enumC3687 = EnumC3687.f12307;
        if (obj == null) {
            return enumC3687;
        }
        if (Boolean.TRUE.equals(obj)) {
            return EnumC3687.f12303;
        }
        if (Boolean.FALSE.equals(obj)) {
            return EnumC3687.f12305;
        }
        if (z && "eu_consent_policy".equals(obj)) {
            return EnumC3687.f12304;
        }
        C3610 c3611 = c5371.f17717;
        C5371.m9020(c3611);
        c3611.f12022.m9430(str, "Invalid manifest metadata for");
        return enumC3687;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final String m1164(String str, C2462 c2462) {
        return TextUtils.isEmpty(str) ? (String) c2462.m4592(null) : (String) c2462.m4592(this.f1841.mo3507(str, c2462.f8223));
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final String m1165(String str) {
        C5371 c5371 = (C5371) this.f18660;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            AbstractC0487.m1047(str2);
            return str2;
        } catch (ClassNotFoundException e) {
            C3610 c3610 = c5371.f17717;
            C5371.m9020(c3610);
            c3610.f12020.m9430(e, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e2) {
            C3610 c3611 = c5371.f17717;
            C5371.m9020(c3611);
            c3611.f12020.m9430(e2, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e3) {
            C3610 c3612 = c5371.f17717;
            C5371.m9020(c3612);
            c3612.f12020.m9430(e3, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e4) {
            C3610 c3613 = c5371.f17717;
            C5371.m9020(c3613);
            c3613.f12020.m9430(e4, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    /* JADX INFO: renamed from: ۦٚ */
    public final Boolean m1166(String str) {
        AbstractC0487.m1090(str);
        Bundle bundleM1154 = m1154();
        if (bundleM1154 != null) {
            if (bundleM1154.containsKey(str)) {
                return Boolean.valueOf(bundleM1154.getBoolean(str));
            }
            return null;
        }
        C3610 c3610 = ((C5371) this.f18660).f17717;
        C5371.m9020(c3610);
        c3610.f12020.m9432("Failed to load metadata: Metadata bundle is null");
        return null;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final int m1167(String str, boolean z) {
        return Math.max(z ? Math.max(Math.min(m1153(str, AbstractC4936.f16305), 500), 100) : 500, 256);
    }
}
