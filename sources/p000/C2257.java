package p000;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: ۥۚؒؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2257 implements InterfaceC5370 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f7483;

    /* JADX INFO: renamed from: ۥَ */
    public final InterfaceC4643 f7484;

    /* JADX INFO: renamed from: ۥُ */
    public final EnumC1616 f7485;

    /* JADX INFO: renamed from: ۥّ */
    public final int f7486;

    /* JADX INFO: renamed from: ۥْ */
    public final List f7487;

    /* JADX INFO: renamed from: ۥٓ */
    public final List f7488;

    /* JADX INFO: renamed from: ۥٖ */
    public final InterfaceC2880 f7489;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f7490;

    /* JADX INFO: renamed from: ۥۜ */
    public final int f7491;

    /* JADX INFO: renamed from: ۥۣ */
    public final List f7492;

    /* JADX INFO: renamed from: ۦؑ */
    public final int f7493;

    /* JADX INFO: renamed from: ۦؚ */
    public final int f7494;

    /* JADX INFO: renamed from: ۦٌ */
    public final boolean f7495;

    /* JADX INFO: renamed from: ۦِ */
    public final C3000 f7496;

    /* JADX INFO: renamed from: ۦٗ */
    public final long f7497;

    /* JADX INFO: renamed from: ۦٛ */
    public final C3000 f7498;

    /* JADX INFO: renamed from: ۦۗ */
    public final float f7499;

    /* JADX INFO: renamed from: ۦۙ */
    public final int f7500;

    /* JADX INFO: renamed from: ۦۚ */
    public final C0373 f7501;

    /* JADX INFO: renamed from: ۦ۟ */
    public final boolean f7502;

    /* JADX INFO: renamed from: ۦۨ */
    public final InterfaceC5370 f7503;

    public C2257(List list, int i, int i2, int i3, EnumC1616 enumC1616, int i4, int i5, int i6, C3000 c3000, C3000 c3001, float f, int i7, boolean z, C0373 c0373, InterfaceC5370 interfaceC5370, boolean z2, List list2, List list3, InterfaceC4643 interfaceC4643, InterfaceC2880 interfaceC2880, long j) {
        this.f7492 = list;
        this.f7490 = i;
        this.f7483 = i2;
        this.f7493 = i3;
        this.f7485 = enumC1616;
        this.f7486 = i4;
        this.f7500 = i5;
        this.f7491 = i6;
        this.f7498 = c3000;
        this.f7496 = c3001;
        this.f7499 = f;
        this.f7494 = i7;
        this.f7495 = z;
        this.f7501 = c0373;
        this.f7503 = interfaceC5370;
        this.f7502 = z2;
        this.f7487 = list2;
        this.f7488 = list3;
        this.f7484 = interfaceC4643;
        this.f7489 = interfaceC2880;
        this.f7497 = j;
    }

    @Override // p000.InterfaceC5370
    /* JADX INFO: renamed from: ۥؗ */
    public final int mo618() {
        return this.f7503.mo618();
    }

    @Override // p000.InterfaceC5370
    /* JADX INFO: renamed from: ۥُ */
    public final int mo619() {
        return this.f7503.mo619();
    }

    /* JADX INFO: renamed from: ۥّ */
    public final C2257 m4299(int i) {
        int i2;
        int i3 = this.f7490 + this.f7483;
        if (this.f7502) {
            return null;
        }
        List list = this.f7492;
        if (list.isEmpty() || this.f7498 == null || (i2 = this.f7494 - i) < 0 || i2 >= i3) {
            return null;
        }
        float f = this.f7499 - (i3 != 0 ? i / i3 : 0.0f);
        if (this.f7496 == null || f >= 0.5f || f <= -0.5f) {
            return null;
        }
        C3000 c3000 = (C3000) AbstractC0973.m2045(list);
        C3000 c3001 = (C3000) AbstractC0973.m2040(list);
        int i4 = this.f7500;
        int i5 = this.f7486;
        if (i < 0) {
            if (Math.min((c3000.f10088 + i3) - i5, (c3001.f10088 + i3) - i4) <= (-i)) {
                return null;
            }
        } else if (Math.min(i5 - c3000.f10088, i4 - c3001.f10088) <= i) {
            return null;
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((C3000) list.get(i6)).m5590(i);
        }
        List list2 = this.f7487;
        int size2 = list2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            ((C3000) list2.get(i7)).m5590(i);
        }
        List list3 = this.f7488;
        int size3 = list3.size();
        for (int i8 = 0; i8 < size3; i8++) {
            ((C3000) list3.get(i8)).m5590(i);
        }
        return new C2257(this.f7492, this.f7490, this.f7483, this.f7493, this.f7485, this.f7486, this.f7500, this.f7491, this.f7498, this.f7496, f, i2, this.f7495 || i > 0, this.f7501, this.f7503, this.f7502, this.f7487, this.f7488, this.f7484, this.f7489, this.f7497);
    }

    @Override // p000.InterfaceC5370
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo620() {
        this.f7503.mo620();
    }

    @Override // p000.InterfaceC5370
    /* JADX INFO: renamed from: ۥۣ */
    public final Map mo621() {
        return this.f7503.mo621();
    }

    @Override // p000.InterfaceC5370
    /* JADX INFO: renamed from: ۦؑ */
    public final InterfaceC4745 mo2711() {
        return this.f7503.mo2711();
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final long m4300() {
        InterfaceC5370 interfaceC5370 = this.f7503;
        return (((long) interfaceC5370.mo619()) << 32) | (((long) interfaceC5370.mo618()) & 4294967295L);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C2257(int i, int i2, int i3, int i4, int i5, int i6, C0373 c0373, InterfaceC5370 interfaceC5370, InterfaceC4643 interfaceC4643, InterfaceC2880 interfaceC2880, long j) {
        C2340 c2340 = C2340.f7777;
        this(c2340, i, i2, i3, EnumC1616.f5424, i4, i5, i6, null, null, 0.0f, 0, false, c0373, interfaceC5370, false, c2340, c2340, interfaceC4643, interfaceC2880, j);
    }
}
