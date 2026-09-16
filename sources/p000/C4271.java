package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ۦؘُٕۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4271 {

    /* JADX INFO: renamed from: ۥَ */
    public static final int[] f14135 = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};

    /* JADX INFO: renamed from: ۥٓ */
    public static final char[] f14136;

    /* JADX INFO: renamed from: ۥْ */
    public final int[] f14140;

    /* JADX INFO: renamed from: ۥۗ */
    public final C5783 f14141;

    /* JADX INFO: renamed from: ۥۣ */
    public final C3884 f14143;

    /* JADX INFO: renamed from: ۦؑ */
    public AbstractC4294 f14144;

    /* JADX INFO: renamed from: ۦؚ */
    public final C4638 f14145;

    /* JADX INFO: renamed from: ۦٌ */
    public final C5506 f14146;

    /* JADX INFO: renamed from: ۦِ */
    public final C5891 f14147;

    /* JADX INFO: renamed from: ۦٛ */
    public AbstractC4435 f14148;

    /* JADX INFO: renamed from: ۦۗ */
    public final C5177 f14149;

    /* JADX INFO: renamed from: ۦۚ */
    public final C3874 f14151;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int[] f14152;

    /* JADX INFO: renamed from: ۦۨ */
    public String f14153;

    /* JADX INFO: renamed from: ۥؗ */
    public EnumC3840 f14137 = EnumC3840.f12856;

    /* JADX INFO: renamed from: ۥُ */
    public boolean f14138 = false;

    /* JADX INFO: renamed from: ۥّ */
    public String f14139 = null;

    /* JADX INFO: renamed from: ۦۙ */
    public final StringBuilder f14150 = new StringBuilder(1024);

    /* JADX INFO: renamed from: ۥۜ */
    public final StringBuilder f14142 = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f14136 = cArr;
        Arrays.sort(cArr);
    }

    public C4271(C3884 c3884, C5783 c5783) {
        C5891 c5891 = new C5891(2);
        c5891.f14621 = new C3108();
        this.f14147 = c5891;
        this.f14149 = new C5177(3);
        this.f14145 = new C4638(5);
        this.f14146 = new C5506();
        this.f14151 = new C3874();
        this.f14152 = new int[1];
        this.f14140 = new int[2];
        this.f14143 = c3884;
        this.f14141 = c5783;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (java.util.Arrays.binarySearch(p000.C4271.f14136, r3[r1.f12990]) >= 0) goto L4;
     */
    /* JADX INFO: renamed from: ۥؗ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int[] m7563(java.lang.Character r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 493
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4271.m7563(java.lang.Character, boolean):int[]");
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m7564() {
        AbstractC4294.m7586(this.f14142);
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m7565(char c) {
        m7567(String.valueOf(c));
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m7566(String str) {
        C5783 c5783 = this.f14141;
        if (c5783.size() < 0) {
            C3884 c3884 = this.f14143;
            c5783.add(new C1762(c3884.f12991 + c3884.f12990, "Invalid character reference: %s", new Object[]{str}));
        }
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final void m7567(String str) {
        if (this.f14139 == null) {
            this.f14139 = str;
            return;
        }
        StringBuilder sb = this.f14150;
        if (sb.length() == 0) {
            sb.append(this.f14139);
        }
        sb.append(str);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m7568(EnumC3840 enumC3840) {
        this.f14143.m6960();
        this.f14137 = enumC3840;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC4435 m7569(boolean z) {
        AbstractC4435 abstractC4435;
        if (z) {
            abstractC4435 = this.f14147;
            abstractC4435.mo975();
        } else {
            abstractC4435 = this.f14149;
            abstractC4435.mo975();
        }
        this.f14148 = abstractC4435;
        return abstractC4435;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public final void m7570(EnumC3840 enumC3840) {
        C5783 c5783 = this.f14141;
        if (c5783.size() < 0) {
            C3884 c3884 = this.f14143;
            c5783.add(new C1762(c3884.f12991 + c3884.f12990, "Unexpectedly reached end of file (EOF) in input state [%s]", new Object[]{enumC3840}));
        }
    }

    /* JADX INFO: renamed from: ۦٌ */
    public final void m7571(EnumC3840 enumC3840) {
        C5783 c5783 = this.f14141;
        if (c5783.size() < 0) {
            C3884 c3884 = this.f14143;
            c5783.add(new C1762(c3884.f12991 + c3884.f12990, "Unexpected character '%s' in input state [%s]", new Object[]{Character.valueOf(c3884.m6965()), enumC3840}));
        }
    }

    /* JADX INFO: renamed from: ۦِ */
    public final void m7572() {
        m7575(this.f14146);
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final void m7573() {
        m7575(this.f14151);
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final void m7574() {
        AbstractC4435 abstractC4435 = this.f14148;
        if (abstractC4435.f14620 != null) {
            abstractC4435.m7730();
        }
        m7575(this.f14148);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m7575(AbstractC4294 abstractC4294) {
        if (this.f14138) {
            C1078.m2272("There is an unread token pending!");
            return;
        }
        this.f14144 = abstractC4294;
        this.f14138 = true;
        int i = abstractC4294.f14205;
        if (i == 2) {
            this.f14153 = ((C5891) abstractC4294).f14618;
            return;
        }
        if (i != 3 || ((C5177) abstractC4294).f14621 == null) {
            return;
        }
        C5783 c5783 = this.f14141;
        if (c5783.size() < 0) {
            C3884 c3884 = this.f14143;
            int i2 = c3884.f12991 + c3884.f12990;
            C1762 c1762 = new C1762();
            c1762.f5868 = i2;
            c1762.f5867 = "Attributes incorrectly present on end tag";
            c5783.add(c1762);
        }
    }

    /* JADX INFO: renamed from: ۦۚ */
    public final boolean m7576() {
        return this.f14153 != null && this.f14148.m7734().equalsIgnoreCase(this.f14153);
    }
}
