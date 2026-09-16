package p000;

import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: ۦٙؑۨۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4471 {

    /* JADX INFO: renamed from: ۥؗ */
    public final AbstractC4314 f14738;

    /* JADX INFO: renamed from: ۥُ */
    public final String f14739;

    /* JADX INFO: renamed from: ۥّ */
    public final List f14740;

    /* JADX INFO: renamed from: ۥۗ */
    public final List f14741;

    /* JADX INFO: renamed from: ۥۜ */
    public final boolean f14742;

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean f14743;

    /* JADX INFO: renamed from: ۦؑ */
    public final String f14744;

    /* JADX INFO: renamed from: ۦِ */
    public final boolean f14745;

    /* JADX INFO: renamed from: ۦٛ */
    public final boolean f14746;

    /* JADX INFO: renamed from: ۦۗ */
    public final C4096 f14747;

    /* JADX INFO: renamed from: ۦۙ */
    public final List f14748;

    public C4471(boolean z, AbstractC4822 abstractC4822, AbstractC4314 abstractC4314, String str, String str2, AbstractC4822 abstractC4823, AbstractC4822 abstractC4824, boolean z2, boolean z3, boolean z4, C4096 c4096) {
        this.f14743 = z;
        this.f14741 = abstractC4822;
        this.f14738 = abstractC4314;
        this.f14744 = str;
        this.f14739 = str2;
        this.f14740 = abstractC4823;
        this.f14748 = abstractC4824;
        this.f14742 = z2;
        this.f14746 = z3;
        this.f14745 = z4;
        this.f14747 = c4096;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4471)) {
            return false;
        }
        C4471 c4471 = (C4471) obj;
        return this.f14743 == c4471.f14743 && this.f14741.equals(c4471.f14741) && AbstractC3831.m6874(this.f14738, c4471.f14738) && AbstractC3831.m6874(this.f14744, c4471.f14744) && AbstractC3831.m6874(this.f14739, c4471.f14739) && this.f14740.equals(c4471.f14740) && this.f14748.equals(c4471.f14748) && this.f14742 == c4471.f14742 && this.f14746 == c4471.f14746 && this.f14745 == c4471.f14745 && AbstractC3831.m6874(this.f14747, c4471.f14747);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f14743), this.f14741, this.f14738, this.f14744, this.f14739, this.f14740, this.f14748, Boolean.valueOf(this.f14742), Boolean.valueOf(this.f14746), Boolean.valueOf(this.f14745));
    }

    public final String toString() {
        boolean z = this.f14743;
        int length = String.valueOf(z).length();
        List list = this.f14741;
        int length2 = String.valueOf(list).length();
        AbstractC4314 abstractC4314 = this.f14738;
        int length3 = String.valueOf(abstractC4314).length();
        String str = this.f14744;
        int length4 = String.valueOf(str).length();
        String str2 = this.f14739;
        int length5 = String.valueOf(str2).length();
        List list2 = this.f14740;
        int length6 = String.valueOf(list2).length();
        List list3 = this.f14748;
        int length7 = String.valueOf(list3).length();
        boolean z2 = this.f14742;
        int length8 = String.valueOf(z2).length();
        boolean z3 = this.f14746;
        int length9 = String.valueOf(z3).length();
        boolean z4 = this.f14745;
        int length10 = String.valueOf(z4).length();
        C4096 c4096 = this.f14747;
        StringBuilder sb = new StringBuilder(length + 59 + length2 + 9 + length3 + 10 + length4 + 17 + length5 + 30 + length6 + 30 + length7 + 24 + length8 + 26 + length9 + 20 + length10 + 14 + String.valueOf(c4096).length() + 1);
        sb.append("SharedStorageInfo(shouldUseSharedStorage=");
        sb.append(z);
        sb.append(", enabledBackings=");
        sb.append(list);
        sb.append(", secret=");
        sb.append(abstractC4314);
        sb.append(", dirPath=");
        sb.append(str);
        sb.append(", gmsCoreDirPath=");
        sb.append(str2);
        sb.append(", includeStaticConfigPackages=");
        sb.append(list2);
        sb.append(", excludeStaticConfigPackages=");
        sb.append(list3);
        sb.append(", hasStorageInfoFromGms=");
        sb.append(z2);
        sb.append(", allowEmptySnapshotToken=");
        sb.append(z3);
        sb.append(", enableCommitV2Api=");
        sb.append(z4);
        sb.append(", clientFlags=");
        sb.append(c4096);
        sb.append(")");
        return sb.toString();
    }
}
