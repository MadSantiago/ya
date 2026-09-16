package p000;

/* JADX INFO: renamed from: ۦٛؑؑۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4592 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C3943 f15155;

    /* JADX INFO: renamed from: ۥۗ */
    public static final C3404 f15153 = new C3404();

    /* JADX INFO: renamed from: ۥؗ */
    public static final String f15151 = m7962("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* JADX INFO: renamed from: ۦؑ */
    public static final String f15154 = m7962("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* JADX INFO: renamed from: ۥُ */
    public static final C1078 f15152 = new C1078(25);

    public C4592(C3943 c3943) {
        this.f15155 = c3943;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static String m7962(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            C1078.m2272("Invalid input received");
            return null;
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }
}
