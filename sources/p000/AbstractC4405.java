package p000;

import android.content.SharedPreferences;
import android.text.TextUtils;

/* JADX INFO: renamed from: ۦ٘ؑٗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4405 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C4645 f14503;

    static {
        C1868 c1868 = AbstractC4822.f15887;
        Object[] objArr = new Object[24];
        objArr[0] = "Version";
        objArr[1] = "GoogleConsent";
        objArr[2] = "VendorConsent";
        objArr[3] = "VendorLegitimateInterest";
        objArr[4] = "gdprApplies";
        objArr[5] = "EnableAdvertiserConsentMode";
        objArr[6] = "PolicyVersion";
        objArr[7] = "PurposeConsents";
        objArr[8] = "PurposeOneTreatment";
        objArr[9] = "Purpose1";
        objArr[10] = "Purpose3";
        objArr[11] = "Purpose4";
        System.arraycopy(new String[]{"Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics"}, 0, objArr, 12, 12);
        AbstractC3831.m6883(24, objArr);
        f14503 = AbstractC4822.m8197(24, objArr);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static final int m7693(EnumC3613 enumC3613) {
        if (enumC3613 == EnumC3613.f12042) {
            return 1;
        }
        if (enumC3613 == EnumC3613.f12036) {
            return 2;
        }
        if (enumC3613 == EnumC3613.f12034) {
            return 3;
        }
        return enumC3613 == EnumC3613.f12037 ? 4 : -1;
    }

    /* JADX INFO: renamed from: ۥُ */
    public static final boolean m7694(EnumC3613 enumC3613, char[] cArr, String str, boolean z) {
        char c;
        int iM7693 = m7693(enumC3613);
        if (!z) {
            c = '4';
        } else {
            if (str.length() >= enumC3613.mo1880()) {
                char cCharAt = str.charAt(enumC3613.mo1880() - 1);
                boolean z2 = cCharAt == '1';
                if (iM7693 > 0 && cArr[iM7693] != '2') {
                    cArr[iM7693] = cCharAt != '1' ? '6' : '1';
                }
                return z2;
            }
            c = '0';
        }
        if (iM7693 > 0 && cArr[iM7693] != '2') {
            cArr[iM7693] = c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥّ */
    public static final boolean m7695(EnumC3613 enumC3613, char[] cArr, String str, boolean z) {
        char c;
        int iM7693 = m7693(enumC3613);
        if (!z) {
            c = '5';
        } else {
            if (str.length() >= enumC3613.mo1880()) {
                char cCharAt = str.charAt(enumC3613.mo1880() - 1);
                boolean z2 = cCharAt == '1';
                if (iM7693 > 0 && cArr[iM7693] != '2') {
                    cArr[iM7693] = cCharAt != '1' ? '7' : '1';
                }
                return z2;
            }
            c = '0';
        }
        if (iM7693 > 0 && cArr[iM7693] != '2') {
            cArr[iM7693] = c;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final boolean m7696(EnumC3613 enumC3613, C5147 c5147, C5147 c5148, C3537 c3537, char[] cArr, int i, int i2, int i3, String str, String str2, String str3, boolean z, boolean z2) {
        EnumC3727 enumC3727;
        char c;
        int iM7693 = m7693(enumC3613);
        if (iM7693 > 0 && (i2 != 1 || i != 1)) {
            cArr[iM7693] = '2';
        }
        if (m7699(enumC3613, c5148) == EnumC3724.f12408) {
            c = '3';
        } else {
            if (enumC3613 == EnumC3613.f12042 && i3 == 1 && c3537.f11743.equals(str)) {
                if (iM7693 > 0 && cArr[iM7693] != '2') {
                    cArr[iM7693] = '1';
                }
                return true;
            }
            if (c5147.containsKey(enumC3613) && (enumC3727 = (EnumC3727) c5147.get(enumC3613)) != null) {
                int iOrdinal = enumC3727.ordinal();
                EnumC3724 enumC3724 = EnumC3724.f12405;
                if (iOrdinal != 0) {
                    EnumC3724 enumC3725 = EnumC3724.f12404;
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return m7699(enumC3613, c5148) == enumC3724 ? m7695(enumC3613, cArr, str3, z2) : m7694(enumC3613, cArr, str2, z);
                        }
                        if (iOrdinal == 3) {
                            return m7699(enumC3613, c5148) == enumC3725 ? m7694(enumC3613, cArr, str2, z) : m7695(enumC3613, cArr, str3, z2);
                        }
                        c = '0';
                    } else if (m7699(enumC3613, c5148) != enumC3725) {
                        return m7695(enumC3613, cArr, str3, z2);
                    }
                } else if (m7699(enumC3613, c5148) != enumC3724) {
                    return m7694(enumC3613, cArr, str2, z);
                }
                c = '8';
            } else {
                c = '0';
            }
        }
        if (iM7693 <= 0 || cArr[iM7693] == '2') {
            return false;
        }
        cArr[iM7693] = c;
        return false;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static String m7697(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static final String m7698(EnumC3613 enumC3613, String str, String str2) {
        String strValueOf = "0";
        String strValueOf2 = (TextUtils.isEmpty(str) || str.length() < enumC3613.mo1880()) ? "0" : String.valueOf(str.charAt(enumC3613.mo1880() - 1));
        if (!TextUtils.isEmpty(str2) && str2.length() >= enumC3613.mo1880()) {
            strValueOf = String.valueOf(str2.charAt(enumC3613.mo1880() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static final EnumC3724 m7699(EnumC3613 enumC3613, C5147 c5147) {
        Object obj = c5147.get(enumC3613);
        if (obj == null) {
            obj = EnumC3724.f12403;
        }
        return (EnumC3724) obj;
    }
}
