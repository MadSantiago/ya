package p000;

import java.io.Closeable;

/* JADX INFO: renamed from: ۥۘؓؑۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2147 implements Closeable {

    /* JADX INFO: renamed from: ۥؓ */
    public final C4752 f7029;

    /* JADX INFO: renamed from: ۥؖ */
    public final long f7030;

    /* JADX INFO: renamed from: ۥَ */
    public final C4073 f7031;

    /* JADX INFO: renamed from: ۥْ */
    public final String f7032;

    /* JADX INFO: renamed from: ۥٓ */
    public final int f7033;

    /* JADX INFO: renamed from: ۥٖ */
    public final C4714 f7034;

    /* JADX INFO: renamed from: ۥٙ */
    public final long f7035;

    /* JADX INFO: renamed from: ۥۖ */
    public final C2147 f7036;

    /* JADX INFO: renamed from: ۥۧ */
    public C1035 f7037;

    /* JADX INFO: renamed from: ۦٕ */
    public final C2147 f7038;

    /* JADX INFO: renamed from: ۦٗ */
    public final AbstractC2978 f7039;

    /* JADX INFO: renamed from: ۦۛ */
    public final C2147 f7040;

    /* JADX INFO: renamed from: ۦ۟ */
    public final EnumC1658 f7041;

    /* JADX INFO: renamed from: ۦۨ */
    public final C2813 f7042;

    public C2147(C2813 c2813, EnumC1658 enumC1658, String str, int i, C4073 c4073, C4714 c4714, AbstractC2978 abstractC2978, C2147 c2147, C2147 c2148, C2147 c2149, long j, long j2, C4752 c4752) {
        this.f7042 = c2813;
        this.f7041 = enumC1658;
        this.f7032 = str;
        this.f7033 = i;
        this.f7031 = c4073;
        this.f7034 = c4714;
        this.f7039 = abstractC2978;
        this.f7040 = c2147;
        this.f7036 = c2148;
        this.f7038 = c2149;
        this.f7035 = j;
        this.f7030 = j2;
        this.f7029 = c4752;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC2978 abstractC2978 = this.f7039;
        if (abstractC2978 != null) {
            abstractC2978.close();
        } else {
            C1078.m2276("response is not eligible for a body and must not be closed");
        }
    }

    public final String toString() {
        return "Response{protocol=" + this.f7041 + ", code=" + this.f7033 + ", message=" + this.f7032 + ", url=" + ((C0774) this.f7042.f9393) + '}';
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final C1033 m4176() {
        C1033 c1033 = new C1033();
        c1033.f3645 = this.f7042;
        c1033.f3643 = this.f7041;
        c1033.f3640 = this.f7033;
        c1033.f3646 = this.f7032;
        c1033.f3641 = this.f7031;
        c1033.f3642 = this.f7034.m8046();
        c1033.f3652 = this.f7039;
        c1033.f3644 = this.f7040;
        c1033.f3650 = this.f7036;
        c1033.f3649 = this.f7038;
        c1033.f3651 = this.f7035;
        c1033.f3647 = this.f7030;
        c1033.f3648 = this.f7029;
        return c1033;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean m4177() {
        int i = this.f7033;
        return 200 <= i && i < 300;
    }
}
