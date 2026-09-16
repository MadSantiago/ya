package p000;

import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: ۥِٛؖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1781 {

    /* JADX INFO: renamed from: ۦؚ */
    public static final char[] f5935 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: ۦٌ */
    public static final Pattern f5936 = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* JADX INFO: renamed from: ۥؗ */
    public String f5937;

    /* JADX INFO: renamed from: ۥُ */
    public final C1414 f5938 = new C1414(7);

    /* JADX INFO: renamed from: ۥّ */
    public final C5086 f5939;

    /* JADX INFO: renamed from: ۥۗ */
    public final C0774 f5940;

    /* JADX INFO: renamed from: ۥۜ */
    public final boolean f5941;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f5942;

    /* JADX INFO: renamed from: ۦؑ */
    public C3303 f5943;

    /* JADX INFO: renamed from: ۦِ */
    public final C5002 f5944;

    /* JADX INFO: renamed from: ۦٛ */
    public final C2808 f5945;

    /* JADX INFO: renamed from: ۦۗ */
    public AbstractC2577 f5946;

    /* JADX INFO: renamed from: ۦۙ */
    public C0822 f5947;

    public C1781(String str, C0774 c0774, String str2, C4714 c4714, C0822 c0822, boolean z, boolean z2, boolean z3) {
        this.f5942 = str;
        this.f5940 = c0774;
        this.f5937 = str2;
        this.f5947 = c0822;
        this.f5941 = z;
        if (c4714 != null) {
            this.f5939 = c4714.m8046();
        } else {
            this.f5939 = new C5086(24);
        }
        if (z2) {
            this.f5944 = new C5002(28);
            return;
        }
        if (z3) {
            C2808 c2808 = new C2808(20);
            this.f5945 = c2808;
            C0822 c0823 = C1528.f5175;
            if (c0823.f2916.equals("multipart")) {
                c2808.f9376 = c0823;
            } else {
                throw new IllegalArgumentException(("multipart != " + c0823).toString());
            }
        }
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m3565(C4714 c4714, AbstractC2577 abstractC2577) {
        C2808 c2808 = this.f5945;
        c2808.getClass();
        if (c4714.m8048("Content-Type") != null) {
            C1078.m2272("Unexpected header: Content-Type");
        } else if (c4714.m8048("Content-Length") != null) {
            C1078.m2272("Unexpected header: Content-Length");
        } else {
            ((ArrayList) c2808.f9377).add(new C3394(c4714, abstractC2577));
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m3566(String str, String str2, boolean z) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                Pattern pattern = C0822.f2914;
                this.f5947 = AbstractC5378.m9040(str2);
                return;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(AbstractC3761.m6628("Malformed content type: ", str2), e);
            }
        }
        C5086 c5086 = this.f5939;
        if (z) {
            c5086.m8692(str, str2);
        } else {
            c5086.m8691(str, str2);
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m3567(String str, String str2, boolean z) {
        C5002 c5002 = this.f5944;
        if (z) {
            ((ArrayList) c5002.f16551).add(C3223.m5937(0, 0, 83, str, " \"':;<=>@[]^`{}|/\\?#&!$(),~"));
            ((ArrayList) c5002.f16550).add(C3223.m5937(0, 0, 83, str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~"));
        } else {
            ((ArrayList) c5002.f16551).add(C3223.m5937(0, 0, 91, str, " \"':;<=>@[]^`{}|/\\?#&!$(),~"));
            ((ArrayList) c5002.f16550).add(C3223.m5937(0, 0, 91, str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~"));
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m3568(String str, String str2, boolean z) {
        C3303 c3303;
        C0774 c0774 = this.f5940;
        String str3 = this.f5937;
        if (str3 != null) {
            try {
                c3303 = new C3303();
                c3303.m6062(c0774, str3);
            } catch (IllegalArgumentException unused) {
                c3303 = null;
            }
            this.f5943 = c3303;
            if (c3303 == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(c0774);
                C2316.m4363(sb, ", Relative: ", this.f5937);
                return;
            }
            this.f5937 = null;
        }
        C3303 c3304 = this.f5943;
        if (z) {
            ArrayList arrayList = c3304.f11065;
            if (arrayList == null) {
                arrayList = new ArrayList();
                c3304.f11065 = arrayList;
            }
            arrayList.add(C3223.m5937(0, 0, 211, str, " \"'<>#&="));
            c3304.f11065.add(str2 != null ? C3223.m5937(0, 0, 211, str2, " \"'<>#&=") : null);
            return;
        }
        ArrayList arrayList2 = c3304.f11065;
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
            c3304.f11065 = arrayList2;
        }
        arrayList2.add(C3223.m5937(0, 0, 219, str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~"));
        c3304.f11065.add(str2 != null ? C3223.m5937(0, 0, 219, str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~") : null);
    }
}
