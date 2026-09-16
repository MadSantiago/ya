package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.ext.SdkExtensions;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: ۥًٞؗٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1968 extends AbstractC4351 {

    /* JADX INFO: renamed from: ۥؓ */
    public final String f6503;

    /* JADX INFO: renamed from: ۥؖ */
    public String f6504;

    /* JADX INFO: renamed from: ۥً */
    public String f6505;

    /* JADX INFO: renamed from: ۥَ */
    public int f6506;

    /* JADX INFO: renamed from: ۥْ */
    public String f6507;

    /* JADX INFO: renamed from: ۥٓ */
    public String f6508;

    /* JADX INFO: renamed from: ۥٕ */
    public long f6509;

    /* JADX INFO: renamed from: ۥٖ */
    public String f6510;

    /* JADX INFO: renamed from: ۥٙ */
    public List f6511;

    /* JADX INFO: renamed from: ۥۖ */
    public final long f6512;

    /* JADX INFO: renamed from: ۥۙ */
    public String f6513;

    /* JADX INFO: renamed from: ۥۧ */
    public int f6514;

    /* JADX INFO: renamed from: ۦٕ */
    public final long f6515;

    /* JADX INFO: renamed from: ۦٗ */
    public String f6516;

    /* JADX INFO: renamed from: ۦٚ */
    public String f6517;

    /* JADX INFO: renamed from: ۦۛ */
    public long f6518;

    public C1968(C5371 c5371, long j, long j2, String str) {
        super(c5371);
        this.f6509 = 0L;
        this.f6513 = null;
        this.f6512 = j;
        this.f6515 = j2;
        this.f6503 = str;
    }

    @Override // p000.AbstractC4351
    /* JADX INFO: renamed from: ۥٖ */
    public final boolean mo3853() {
        return true;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final String m3854() {
        m7643();
        AbstractC0487.m1047(this.f6507);
        return this.f6507;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final String m3855() {
        mo6517();
        m7643();
        AbstractC0487.m1047(this.f6505);
        return this.f6505;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0272 A[Catch: NameNotFoundException -> 0x027a, TRY_LEAVE, TryCatch #1 {NameNotFoundException -> 0x027a, blocks: (B:98:0x026c, B:100:0x0272), top: B:129:0x026c }] */
    /* JADX WARN: Code duplicated, block: B:102:0x0275 A[PHI: r5 r37
  0x0275: PHI (r5v16 int) = (r5v15 int), (r5v17 int) binds: [B:104:0x027a, B:99:0x0270] A[DONT_GENERATE, DONT_INLINE]
  0x0275: PHI (r37v2 boolean) = (r37v1 boolean), (r37v4 boolean) binds: [B:104:0x027a, B:99:0x0270] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:108:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:113:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:117:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:118:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:121:0x0313  */
    /* JADX WARN: Code duplicated, block: B:127:0x0152 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x025d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x0128 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0108  */
    /* JADX WARN: Code duplicated, block: B:37:0x010d  */
    /* JADX WARN: Code duplicated, block: B:39:0x011d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0134  */
    /* JADX WARN: Code duplicated, block: B:44:0x0138  */
    /* JADX WARN: Code duplicated, block: B:57:0x018a  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:71:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:77:0x0203  */
    /* JADX WARN: Code duplicated, block: B:78:0x0206  */
    /* JADX WARN: Code duplicated, block: B:87:0x022d  */
    /* JADX WARN: Code duplicated, block: B:91:0x023a  */
    /* JADX WARN: Code duplicated, block: B:92:0x023c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0257  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: ۦٗ */
    public final C5855 m3856(String str) {
        String str2;
        long j;
        boolean z;
        long j2;
        boolean zM9024;
        boolean z2;
        boolean z3;
        String str3;
        Class<?> clsLoadClass;
        Object objInvoke;
        long jM7371;
        long jMin;
        Boolean boolM1166;
        boolean z4;
        boolean z5;
        String strM3208;
        boolean z6;
        String str4;
        Boolean boolM1167;
        boolean zBooleanValue;
        C5371 c5371;
        String strM3854;
        boolean z7;
        int i;
        int i2;
        long j3;
        ApplicationInfo applicationInfo;
        C2462 c2462;
        long j4;
        int extensionVersion;
        long jM3241;
        mo6517();
        String strM3855 = m3854();
        String strM3856 = m3855();
        m7643();
        String str5 = this.f6508;
        m7643();
        long j5 = this.f6506;
        m7643();
        AbstractC0487.m1047(this.f6510);
        String str6 = this.f6510;
        C5371 c5372 = (C5371) this.f18660;
        C0515 c0515 = c5372.f17715;
        C3610 c3610 = c5372.f17717;
        C0515 c0516 = c5372.f17715;
        Context context = c5372.f17739;
        C1512 c1512 = c5372.f17721;
        C4474 c4474 = c5372.f17713;
        c0515.m1160();
        m7643();
        mo6517();
        long j6 = this.f6518;
        if (j6 == 0) {
            C5371.m9021(c1512);
            C5371 c5373 = (C5371) c1512.f18660;
            String packageName = context.getPackageName();
            c1512.mo6517();
            AbstractC0487.m1090(packageName);
            PackageManager packageManager = context.getPackageManager();
            z = false;
            MessageDigest messageDigestM3194 = C1512.m3194();
            long jM3197 = -1;
            if (messageDigestM3194 == null) {
                C3610 c3611 = c5373.f17717;
                C5371.m9020(c3611);
                c3611.f12020.m9432("Could not get MD5 instance");
                str2 = str5;
                j = j5;
            } else {
                if (packageManager != null) {
                    try {
                        if (c1512.m3246(context, packageName)) {
                            str2 = str5;
                            j = j5;
                            jM3197 = 0;
                        } else {
                            str2 = str5;
                            try {
                                j = j5;
                                try {
                                    Signature[] signatureArr = C3866.m6899(context).m564(64, c5373.f17739.getPackageName()).signatures;
                                    if (signatureArr == null || signatureArr.length <= 0) {
                                        C3610 c3612 = c5373.f17717;
                                        C5371.m9020(c3612);
                                        c3612.f12022.m9432("Could not get signatures");
                                    } else {
                                        jM3197 = C1512.m3197(messageDigestM3194.digest(signatureArr[0].toByteArray()));
                                    }
                                } catch (PackageManager.NameNotFoundException e) {
                                    e = e;
                                    C3610 c3613 = c5373.f17717;
                                    C5371.m9020(c3613);
                                    c3613.f12020.m9430(e, "Package name not found");
                                    j2 = 0;
                                }
                            } catch (PackageManager.NameNotFoundException e2) {
                                e = e2;
                                j = j5;
                                C3610 c3614 = c5373.f17717;
                                C5371.m9020(c3614);
                                c3614.f12020.m9430(e, "Package name not found");
                                j2 = 0;
                                this.f6518 = j2;
                                zM9024 = c5372.m9024();
                                C5371.m9021(c4474);
                                z2 = !c4474.f14762;
                                mo6517();
                                if (c5372.m9024()) {
                                    if (c0516.m1162(null, AbstractC4936.f16317)) {
                                        C5371.m9020(c3610);
                                        c3610.f12023.m9432("Disabled IID for tests.");
                                        z3 = zM9024;
                                        str3 = null;
                                    } else {
                                        try {
                                            clsLoadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                                            if (clsLoadClass == null) {
                                                z3 = zM9024;
                                            } else {
                                                z3 = zM9024;
                                                try {
                                                    Object[] objArr = {context};
                                                    str3 = null;
                                                    objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, objArr);
                                                    if (objInvoke != null) {
                                                        try {
                                                            str3 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                                                        } catch (Exception unused) {
                                                            C5371.m9020(c3610);
                                                            c3610.f12021.m9432("Failed to retrieve Firebase Instance Id");
                                                            str3 = null;
                                                        }
                                                    }
                                                } catch (Exception unused2) {
                                                    C5371.m9020(c3610);
                                                    c3610.f12024.m9432("Failed to obtain Firebase Analytics instance");
                                                }
                                            }
                                        } catch (ClassNotFoundException unused3) {
                                        }
                                        str3 = null;
                                    }
                                } else {
                                    z3 = zM9024;
                                    str3 = null;
                                }
                                C5371.m9021(c4474);
                                jM7371 = c4474.f14759.m7371();
                                long j7 = j2;
                                jMin = c5372.f17723;
                                if (jM7371 != 0) {
                                    jMin = Math.min(jMin, jM7371);
                                }
                                m7643();
                                int i3 = this.f6514;
                                boolM1166 = c0516.m1166("google_analytics_adid_collection_enabled");
                                if (boolM1166 != null) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                C5371.m9021(c4474);
                                c4474.mo6517();
                                long j8 = jMin;
                                boolean z8 = c4474.m7755().getBoolean("deferred_analytics_collection", z);
                                if (c0516.m1163("google_analytics_default_allow_ad_personalization_signals", true) != EnumC3687.f12303) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                Boolean boolValueOf = Boolean.valueOf(z5);
                                List list = this.f6511;
                                String strM8817 = c4474.m7754().m8817();
                                strM3208 = this.f6504;
                                if (strM3208 == null) {
                                    C5371.m9021(c1512);
                                    strM3208 = c1512.m3208();
                                    this.f6504 = strM3208;
                                }
                                String str7 = strM3208;
                                if (c4474.m7754().m8815(EnumC4635.f15299)) {
                                    mo6517();
                                    if (this.f6509 == 0) {
                                        z6 = z2;
                                    } else {
                                        c5372.f17719.getClass();
                                        long jCurrentTimeMillis = System.currentTimeMillis() - this.f6509;
                                        z6 = z2;
                                        if (this.f6517 != null) {
                                            m3857();
                                        }
                                    }
                                    if (this.f6517 == null) {
                                        m3857();
                                    }
                                    str4 = this.f6517;
                                } else {
                                    z6 = z2;
                                    str4 = null;
                                }
                                boolM1167 = c0516.m1166("google_analytics_sgtm_upload_enabled");
                                if (boolM1167 == null) {
                                    zBooleanValue = false;
                                } else {
                                    zBooleanValue = boolM1167.booleanValue();
                                }
                                C5371.m9021(c1512);
                                c5371 = (C5371) c1512.f18660;
                                String str8 = str4;
                                strM3854 = m3854();
                                boolean z9 = zBooleanValue;
                                if (c5371.f17739.getPackageManager() == null) {
                                    z7 = z4;
                                    j3 = 0;
                                } else {
                                    try {
                                        z7 = z4;
                                        i = 0;
                                        try {
                                            applicationInfo = C3866.m6899(c5371.f17739).f972.getPackageManager().getApplicationInfo(strM3854, 0);
                                            if (applicationInfo != null) {
                                                i2 = applicationInfo.targetSdkVersion;
                                            } else {
                                                i2 = i;
                                            }
                                        } catch (PackageManager.NameNotFoundException unused4) {
                                            C3610 c3615 = c5371.f17717;
                                            C5371.m9020(c3615);
                                            c3615.f12016.m9430(strM3854, "PackageManager failed to find running app: app_id");
                                        }
                                    } catch (PackageManager.NameNotFoundException unused5) {
                                        z7 = z4;
                                        i = 0;
                                    }
                                    j3 = i2;
                                }
                                C5371.m9021(c4474);
                                int i4 = c4474.m7754().f17219;
                                C5371.m9021(c4474);
                                c4474.mo6517();
                                String str9 = C5800.m9610(c4474.m7755().getString("dma_consent_settings", null)).f19114;
                                C0237.m498();
                                c2462 = AbstractC4936.f16258;
                                if (c0516.m1162(null, c2462)) {
                                    C5371.m9021(c1512);
                                    j4 = j3;
                                    if (Build.VERSION.SDK_INT < 30) {
                                    }
                                    C0237.m498();
                                    if (c0516.m1162(null, c2462)) {
                                        C5371.m9021(c1512);
                                        jM3241 = c1512.m3241();
                                    } else {
                                        jM3241 = 0;
                                    }
                                    String str10 = c0516.f1840;
                                    String strValueOf = String.valueOf(C5211.m8809(c0516.m1163("google_analytics_default_allow_ad_personalization_signals", true)));
                                    long j9 = jM3241;
                                    long j10 = c5372.f17723;
                                    C5371.m9022(c5372.f17724);
                                    return new C5855(strM3855, strM3856, str2, j, str6, 161000L, j7, str, z3, z6, str3, j8, i3, z7, z8, boolValueOf, this.f6512, list, strM8817, str7, str8, z9, j4, i4, str9, extensionVersion, j9, str10, strValueOf, j10, AbstractC2049.m3993(c5372.f17724.m8030()), c0516.m1162(null, AbstractC4936.f19565) ? c5372.f17726 : 0L);
                                }
                                j4 = j3;
                                extensionVersion = 0;
                                C0237.m498();
                                if (c0516.m1162(null, c2462)) {
                                    C5371.m9021(c1512);
                                    jM3241 = c1512.m3241();
                                } else {
                                    jM3241 = 0;
                                }
                                String str11 = c0516.f1840;
                                String strValueOf2 = String.valueOf(C5211.m8809(c0516.m1163("google_analytics_default_allow_ad_personalization_signals", true)));
                                long j11 = jM3241;
                                long j12 = c5372.f17723;
                                C5371.m9022(c5372.f17724);
                                return new C5855(strM3855, strM3856, str2, j, str6, 161000L, j7, str, z3, z6, str3, j8, i3, z7, z8, boolValueOf, this.f6512, list, strM8817, str7, str8, z9, j4, i4, str9, extensionVersion, j11, str11, strValueOf2, j12, AbstractC2049.m3993(c5372.f17724.m8030()), c0516.m1162(null, AbstractC4936.f19565) ? c5372.f17726 : 0L);
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e3) {
                        e = e3;
                        str2 = str5;
                    }
                } else {
                    str2 = str5;
                    j = j5;
                }
                j2 = 0;
                this.f6518 = j2;
            }
            j2 = jM3197;
            this.f6518 = j2;
        } else {
            str2 = str5;
            j = j5;
            z = false;
            j2 = j6;
        }
        zM9024 = c5372.m9024();
        C5371.m9021(c4474);
        z2 = !c4474.f14762;
        mo6517();
        if (c5372.m9024()) {
            z3 = zM9024;
            str3 = null;
        } else {
            if (c0516.m1162(null, AbstractC4936.f16317)) {
                C5371.m9020(c3610);
                c3610.f12023.m9432("Disabled IID for tests.");
                z3 = zM9024;
                str3 = null;
            } else {
                clsLoadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                if (clsLoadClass == null) {
                    z3 = zM9024;
                } else {
                    z3 = zM9024;
                    Object[] objArr2 = {context};
                    str3 = null;
                    objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, objArr2);
                    if (objInvoke != null) {
                        str3 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                    }
                }
                str3 = null;
            }
        }
        C5371.m9021(c4474);
        jM7371 = c4474.f14759.m7371();
        long j13 = j2;
        jMin = c5372.f17723;
        if (jM7371 != 0) {
            jMin = Math.min(jMin, jM7371);
        }
        m7643();
        int i5 = this.f6514;
        boolM1166 = c0516.m1166("google_analytics_adid_collection_enabled");
        if (boolM1166 != null || boolM1166.booleanValue()) {
            z4 = true;
        } else {
            z4 = z;
        }
        C5371.m9021(c4474);
        c4474.mo6517();
        long j14 = jMin;
        boolean z10 = c4474.m7755().getBoolean("deferred_analytics_collection", z);
        if (c0516.m1163("google_analytics_default_allow_ad_personalization_signals", true) != EnumC3687.f12303) {
            z5 = true;
        } else {
            z5 = false;
        }
        Boolean boolValueOf2 = Boolean.valueOf(z5);
        List list2 = this.f6511;
        String strM8818 = c4474.m7754().m8817();
        strM3208 = this.f6504;
        if (strM3208 == null) {
            C5371.m9021(c1512);
            strM3208 = c1512.m3208();
            this.f6504 = strM3208;
        }
        String str12 = strM3208;
        if (c4474.m7754().m8815(EnumC4635.f15299)) {
            z6 = z2;
            str4 = null;
        } else {
            mo6517();
            if (this.f6509 == 0) {
                z6 = z2;
            } else {
                c5372.f17719.getClass();
                long jCurrentTimeMillis2 = System.currentTimeMillis() - this.f6509;
                z6 = z2;
                if (this.f6517 != null && jCurrentTimeMillis2 > 86400000 && this.f6513 == null) {
                    m3857();
                }
            }
            if (this.f6517 == null) {
                m3857();
            }
            str4 = this.f6517;
        }
        boolM1167 = c0516.m1166("google_analytics_sgtm_upload_enabled");
        if (boolM1167 == null) {
            zBooleanValue = false;
        } else {
            zBooleanValue = boolM1167.booleanValue();
        }
        C5371.m9021(c1512);
        c5371 = (C5371) c1512.f18660;
        String str13 = str4;
        strM3854 = m3854();
        boolean z11 = zBooleanValue;
        if (c5371.f17739.getPackageManager() == null) {
            z7 = z4;
            j3 = 0;
        } else {
            z7 = z4;
            i = 0;
            applicationInfo = C3866.m6899(c5371.f17739).f972.getPackageManager().getApplicationInfo(strM3854, 0);
            if (applicationInfo != null) {
                i2 = applicationInfo.targetSdkVersion;
            } else {
                i2 = i;
            }
            j3 = i2;
        }
        C5371.m9021(c4474);
        int i6 = c4474.m7754().f17219;
        C5371.m9021(c4474);
        c4474.mo6517();
        String str14 = C5800.m9610(c4474.m7755().getString("dma_consent_settings", null)).f19114;
        C0237.m498();
        c2462 = AbstractC4936.f16258;
        if (c0516.m1162(null, c2462)) {
            C5371.m9021(c1512);
            j4 = j3;
            if (Build.VERSION.SDK_INT < 30 && SdkExtensions.getExtensionVersion(30) > 3) {
                extensionVersion = SdkExtensions.getExtensionVersion(1000000);
            }
            C0237.m498();
            if (c0516.m1162(null, c2462)) {
                C5371.m9021(c1512);
                jM3241 = c1512.m3241();
            } else {
                jM3241 = 0;
            }
            String str15 = c0516.f1840;
            String strValueOf3 = String.valueOf(C5211.m8809(c0516.m1163("google_analytics_default_allow_ad_personalization_signals", true)));
            long j15 = jM3241;
            long j16 = c5372.f17723;
            C5371.m9022(c5372.f17724);
            return new C5855(strM3855, strM3856, str2, j, str6, 161000L, j13, str, z3, z6, str3, j14, i5, z7, z10, boolValueOf2, this.f6512, list2, strM8818, str12, str13, z11, j4, i6, str14, extensionVersion, j15, str15, strValueOf3, j16, AbstractC2049.m3993(c5372.f17724.m8030()), c0516.m1162(null, AbstractC4936.f19565) ? c5372.f17726 : 0L);
        }
        j4 = j3;
        extensionVersion = 0;
        C0237.m498();
        if (c0516.m1162(null, c2462)) {
            C5371.m9021(c1512);
            jM3241 = c1512.m3241();
        } else {
            jM3241 = 0;
        }
        String str16 = c0516.f1840;
        String strValueOf4 = String.valueOf(C5211.m8809(c0516.m1163("google_analytics_default_allow_ad_personalization_signals", true)));
        long j17 = jM3241;
        long j18 = c5372.f17723;
        C5371.m9022(c5372.f17724);
        return new C5855(strM3855, strM3856, str2, j, str6, 161000L, j13, str, z3, z6, str3, j14, i5, z7, z10, boolValueOf2, this.f6512, list2, strM8818, str12, str13, z11, j4, i6, str14, extensionVersion, j17, str16, strValueOf4, j18, AbstractC2049.m3993(c5372.f17724.m8030()), c0516.m1162(null, AbstractC4936.f19565) ? c5372.f17726 : 0L);
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final void m3857() {
        String str;
        mo6517();
        C5371 c5371 = (C5371) this.f18660;
        C4474 c4474 = c5371.f17713;
        C3610 c3610 = c5371.f17717;
        C5371.m9021(c4474);
        if (c4474.m7754().m8815(EnumC4635.f15299)) {
            byte[] bArr = new byte[16];
            C1512 c1512 = c5371.f17721;
            C5371.m9021(c1512);
            c1512.m3244().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            C5371.m9020(c3610);
            c3610.f12015.m9432("Analytics Storage consent is not granted");
            str = null;
        }
        C5371.m9020(c3610);
        c3610.f12015.m9432("Resetting session stitching token to ".concat(str == null ? "null" : "not null"));
        this.f6517 = str;
        c5371.f17719.getClass();
        this.f6509 = System.currentTimeMillis();
    }
}
