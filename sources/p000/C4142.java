package p000;

import androidx.work.OverwritingInputMerger;

/* JADX INFO: renamed from: ۦٓؗٙٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4142 {

    /* JADX INFO: renamed from: ۥؖ */
    public static final /* synthetic */ int f13775 = 0;

    /* JADX INFO: renamed from: ۥؗ */
    public final String f13776;

    /* JADX INFO: renamed from: ۥَ */
    public final int f13777;

    /* JADX INFO: renamed from: ۥُ */
    public final C2775 f13778;

    /* JADX INFO: renamed from: ۥّ */
    public final C2775 f13779;

    /* JADX INFO: renamed from: ۥْ */
    public boolean f13780;

    /* JADX INFO: renamed from: ۥٓ */
    public final int f13781;

    /* JADX INFO: renamed from: ۥٖ */
    public final int f13782;

    /* JADX INFO: renamed from: ۥٙ */
    public final Boolean f13783;

    /* JADX INFO: renamed from: ۥۖ */
    public final int f13784;

    /* JADX INFO: renamed from: ۥۗ */
    public EnumC4972 f13785;

    /* JADX INFO: renamed from: ۥۜ */
    public long f13786;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f13787;

    /* JADX INFO: renamed from: ۦؑ */
    public final String f13788;

    /* JADX INFO: renamed from: ۦؚ */
    public final int f13789;

    /* JADX INFO: renamed from: ۦٌ */
    public final long f13790;

    /* JADX INFO: renamed from: ۦِ */
    public final C4628 f13791;

    /* JADX INFO: renamed from: ۦٕ */
    public String f13792;

    /* JADX INFO: renamed from: ۦٗ */
    public final long f13793;

    /* JADX INFO: renamed from: ۦٛ */
    public long f13794;

    /* JADX INFO: renamed from: ۦۗ */
    public final int f13795;

    /* JADX INFO: renamed from: ۦۙ */
    public long f13796;

    /* JADX INFO: renamed from: ۦۚ */
    public long f13797;

    /* JADX INFO: renamed from: ۦۛ */
    public final int f13798;

    /* JADX INFO: renamed from: ۦ۟ */
    public final long f13799;

    /* JADX INFO: renamed from: ۦۨ */
    public final long f13800;

    static {
        C1984.m3875("WorkSpec");
    }

    public /* synthetic */ C4142(String str, EnumC4972 enumC4972, String str2, String str3, C2775 c2775, C2775 c2776, long j, long j2, long j3, C4628 c4628, int i, int i2, long j4, long j5, long j6, long j7, boolean z, int i3, int i4, long j8, int i5, int i6, String str4, Boolean bool, int i7) {
        this(str, (i7 & 2) != 0 ? EnumC4972.f16455 : enumC4972, str2, (i7 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i7 & 16) != 0 ? C2775.f9249 : c2775, (i7 & 32) != 0 ? C2775.f9249 : c2776, (i7 & 64) != 0 ? 0L : j, (i7 & 128) != 0 ? 0L : j2, (i7 & 256) != 0 ? 0L : j3, (i7 & 512) != 0 ? C4628.f15275 : c4628, (i7 & 1024) != 0 ? 0 : i, (i7 & 2048) != 0 ? 1 : i2, (i7 & 4096) != 0 ? 30000L : j4, (i7 & 8192) != 0 ? -1L : j5, (i7 & 16384) != 0 ? 0L : j6, (32768 & i7) != 0 ? -1L : j7, (65536 & i7) != 0 ? false : z, (131072 & i7) != 0 ? 1 : i3, (262144 & i7) != 0 ? 0 : i4, 0, (1048576 & i7) != 0 ? Long.MAX_VALUE : j8, (2097152 & i7) != 0 ? 0 : i5, (4194304 & i7) != 0 ? -256 : i6, (8388608 & i7) != 0 ? null : str4, (i7 & 16777216) != 0 ? Boolean.FALSE : bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4142)) {
            return false;
        }
        C4142 c4142 = (C4142) obj;
        return AbstractC3831.m6874(this.f13787, c4142.f13787) && this.f13785 == c4142.f13785 && AbstractC3831.m6874(this.f13776, c4142.f13776) && AbstractC3831.m6874(this.f13788, c4142.f13788) && AbstractC3831.m6874(this.f13778, c4142.f13778) && AbstractC3831.m6874(this.f13779, c4142.f13779) && this.f13796 == c4142.f13796 && this.f13786 == c4142.f13786 && this.f13794 == c4142.f13794 && AbstractC3831.m6874(this.f13791, c4142.f13791) && this.f13795 == c4142.f13795 && this.f13789 == c4142.f13789 && this.f13790 == c4142.f13790 && this.f13797 == c4142.f13797 && this.f13800 == c4142.f13800 && this.f13799 == c4142.f13799 && this.f13780 == c4142.f13780 && this.f13781 == c4142.f13781 && this.f13777 == c4142.f13777 && this.f13782 == c4142.f13782 && this.f13793 == c4142.f13793 && this.f13798 == c4142.f13798 && this.f13784 == c4142.f13784 && AbstractC3831.m6874(this.f13792, c4142.f13792) && AbstractC3831.m6874(this.f13783, c4142.f13783);
    }

    public final int hashCode() {
        int iM3999 = AbstractC2049.m3999(this.f13784, AbstractC2049.m3999(this.f13798, AbstractC3761.m6626(AbstractC2049.m3999(this.f13782, AbstractC2049.m3999(this.f13777, (AbstractC3761.m6632(this.f13781) + AbstractC5078.m8672(AbstractC3761.m6626(AbstractC3761.m6626(AbstractC3761.m6626(AbstractC3761.m6626((AbstractC3761.m6632(this.f13789) + AbstractC2049.m3999(this.f13795, (this.f13791.hashCode() + AbstractC3761.m6626(AbstractC3761.m6626(AbstractC3761.m6626((this.f13779.hashCode() + ((this.f13778.hashCode() + AbstractC5078.m8674(AbstractC5078.m8674((this.f13785.hashCode() + (this.f13787.hashCode() * 31)) * 31, 31, this.f13776), 31, this.f13788)) * 31)) * 31, 31, this.f13796), 31, this.f13786), 31, this.f13794)) * 31, 31)) * 31, 31, this.f13790), 31, this.f13797), 31, this.f13800), 31, this.f13799), 31, this.f13780)) * 31, 31), 31), 31, this.f13793), 31), 31);
        String str = this.f13792;
        int iHashCode = (iM3999 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f13783;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC5078.m8678(new StringBuilder("{WorkSpec: "), this.f13787, '}');
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean m7323() {
        return this.f13786 != 0;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final long m7324() {
        EnumC4972 enumC4972 = this.f13785;
        EnumC4972 enumC4973 = EnumC4972.f16455;
        int i = this.f13795;
        boolean z = enumC4972 == enumC4973 && i > 0;
        long j = this.f13797;
        boolean zM7323 = m7323();
        long j2 = this.f13796;
        long j3 = this.f13794;
        long j4 = this.f13786;
        long j5 = this.f13793;
        int i2 = this.f13777;
        if (j5 != Long.MAX_VALUE && zM7323) {
            if (i2 != 0) {
                long j6 = j + 900000;
                if (j5 < j6) {
                    return j6;
                }
            }
            return j5;
        }
        if (z) {
            int i3 = this.f13789;
            long j7 = this.f13790;
            long jScalb = i3 == 2 ? j7 * ((long) i) : (long) Math.scalb(j7, i - 1);
            if (jScalb > 18000000) {
                jScalb = 18000000;
            }
            return j + jScalb;
        }
        if (zM7323) {
            long j8 = i2 == 0 ? j + j2 : j + j4;
            return (j3 == j4 || i2 != 0) ? j8 : (j4 - j3) + j8;
        }
        if (j == -1) {
            return Long.MAX_VALUE;
        }
        return j + j2;
    }

    public C4142(String str, EnumC4972 enumC4972, String str2, String str3, C2775 c2775, C2775 c2776, long j, long j2, long j3, C4628 c4628, int i, int i2, long j4, long j5, long j6, long j7, boolean z, int i3, int i4, int i5, long j8, int i6, int i7, String str4, Boolean bool) {
        this.f13787 = str;
        this.f13785 = enumC4972;
        this.f13776 = str2;
        this.f13788 = str3;
        this.f13778 = c2775;
        this.f13779 = c2776;
        this.f13796 = j;
        this.f13786 = j2;
        this.f13794 = j3;
        this.f13791 = c4628;
        this.f13795 = i;
        this.f13789 = i2;
        this.f13790 = j4;
        this.f13797 = j5;
        this.f13800 = j6;
        this.f13799 = j7;
        this.f13780 = z;
        this.f13781 = i3;
        this.f13777 = i4;
        this.f13782 = i5;
        this.f13793 = j8;
        this.f13798 = i6;
        this.f13784 = i7;
        this.f13792 = str4;
        this.f13783 = bool;
    }
}
