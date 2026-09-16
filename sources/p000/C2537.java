package p000;

import java.util.List;

/* JADX INFO: renamed from: ۥٕۡؑۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2537 {

    /* JADX INFO: renamed from: ۥؗ */
    public final List f8425;

    /* JADX INFO: renamed from: ۥُ */
    public final boolean f8426;

    /* JADX INFO: renamed from: ۥّ */
    public final int f8427;

    /* JADX INFO: renamed from: ۥۗ */
    public final C3564 f8428;

    /* JADX INFO: renamed from: ۥۜ */
    public final EnumC2459 f8429;

    /* JADX INFO: renamed from: ۥۣ */
    public final C1249 f8430;

    /* JADX INFO: renamed from: ۦؑ */
    public final int f8431;

    /* JADX INFO: renamed from: ۦِ */
    public final long f8432;

    /* JADX INFO: renamed from: ۦٛ */
    public final InterfaceC4434 f8433;

    /* JADX INFO: renamed from: ۦۙ */
    public final InterfaceC2880 f8434;

    public C2537(C1249 c1249, C3564 c3564, List list, int i, boolean z, int i2, InterfaceC2880 interfaceC2880, EnumC2459 enumC2459, InterfaceC4434 interfaceC4434, long j) {
        this.f8430 = c1249;
        this.f8428 = c3564;
        this.f8425 = list;
        this.f8431 = i;
        this.f8426 = z;
        this.f8427 = i2;
        this.f8434 = interfaceC2880;
        this.f8429 = enumC2459;
        this.f8433 = interfaceC4434;
        this.f8432 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2537)) {
            return false;
        }
        C2537 c2537 = (C2537) obj;
        return AbstractC3831.m6874(this.f8430, c2537.f8430) && AbstractC3831.m6874(this.f8428, c2537.f8428) && AbstractC3831.m6874(this.f8425, c2537.f8425) && this.f8431 == c2537.f8431 && this.f8426 == c2537.f8426 && this.f8427 == c2537.f8427 && AbstractC3831.m6874(this.f8434, c2537.f8434) && this.f8429 == c2537.f8429 && AbstractC3831.m6874(this.f8433, c2537.f8433) && C3693.m6547(this.f8432, c2537.f8432);
    }

    public final int hashCode() {
        return Long.hashCode(this.f8432) + ((this.f8433.hashCode() + ((this.f8429.hashCode() + ((this.f8434.hashCode() + AbstractC2049.m3999(this.f8427, AbstractC5078.m8672((((this.f8425.hashCode() + AbstractC5078.m8668(this.f8428, this.f8430.hashCode() * 31, 31)) * 31) + this.f8431) * 31, 31, this.f8426), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.f8430);
        sb.append(", style=");
        sb.append(this.f8428);
        sb.append(", placeholders=");
        sb.append(this.f8425);
        sb.append(", maxLines=");
        sb.append(this.f8431);
        sb.append(", softWrap=");
        sb.append(this.f8426);
        sb.append(", overflow=");
        int i = this.f8427;
        if (i == 1) {
            str = "Clip";
        } else if (i == 2) {
            str = "Ellipsis";
        } else if (i == 5) {
            str = "MiddleEllipsis";
        } else if (i == 3) {
            str = "Visible";
        } else {
            str = i == 4 ? "StartEllipsis" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", density=");
        sb.append(this.f8434);
        sb.append(", layoutDirection=");
        sb.append(this.f8429);
        sb.append(", fontFamilyResolver=");
        sb.append(this.f8433);
        sb.append(", constraints=");
        sb.append((Object) C3693.m6554(this.f8432));
        sb.append(')');
        return sb.toString();
    }
}
