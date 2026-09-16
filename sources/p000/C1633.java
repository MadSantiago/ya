package p000;

/* JADX INFO: renamed from: ۥؚٙؒؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1633 implements InterfaceC2864 {

    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC3498 f5471;

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC3498 f5472;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC3498 f5473;

    /* JADX INFO: renamed from: ۦؑ */
    public final InterfaceC3498 f5474;

    public C1633(InterfaceC3498 interfaceC3498, InterfaceC3498 interfaceC3499, InterfaceC3498 interfaceC34910, InterfaceC3498 interfaceC34911) {
        this.f5473 = interfaceC3498;
        this.f5472 = interfaceC3499;
        this.f5471 = interfaceC34910;
        this.f5474 = interfaceC34911;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static C1633 m3439(C1633 c1633, InterfaceC3498 interfaceC3498, InterfaceC3498 interfaceC3499, InterfaceC3498 interfaceC34910, InterfaceC3498 interfaceC34911, int i) {
        if ((i & 1) != 0) {
            interfaceC3498 = c1633.f5473;
        }
        if ((i & 2) != 0) {
            interfaceC3499 = c1633.f5472;
        }
        if ((i & 4) != 0) {
            interfaceC34910 = c1633.f5471;
        }
        if ((i & 8) != 0) {
            interfaceC34911 = c1633.f5474;
        }
        c1633.getClass();
        return new C1633(interfaceC3498, interfaceC3499, interfaceC34910, interfaceC34911);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1633)) {
            return false;
        }
        C1633 c1633 = (C1633) obj;
        return AbstractC3831.m6874(this.f5473, c1633.f5473) && AbstractC3831.m6874(this.f5472, c1633.f5472) && AbstractC3831.m6874(this.f5471, c1633.f5471) && AbstractC3831.m6874(this.f5474, c1633.f5474);
    }

    public final int hashCode() {
        return this.f5474.hashCode() + ((this.f5471.hashCode() + ((this.f5472.hashCode() + (this.f5473.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f5473 + ", topEnd = " + this.f5472 + ", bottomEnd = " + this.f5471 + ", bottomStart = " + this.f5474 + ')';
    }

    @Override // p000.InterfaceC2864
    /* JADX INFO: renamed from: ۥۣ */
    public final AbstractC3925 mo1709(long j, EnumC2459 enumC2459, InterfaceC2880 interfaceC2880) {
        float fMo4393 = this.f5473.mo4393(j, interfaceC2880);
        float fMo4394 = this.f5472.mo4393(j, interfaceC2880);
        float fMo4395 = this.f5471.mo4393(j, interfaceC2880);
        float fMo4396 = this.f5474.mo4393(j, interfaceC2880);
        float fM6052 = C3291.m6052(j);
        float f = fMo4393 + fMo4396;
        if (f > fM6052) {
            float f2 = fM6052 / f;
            fMo4393 *= f2;
            fMo4396 *= f2;
        }
        float f3 = fMo4394 + fMo4395;
        if (f3 > fM6052) {
            float f4 = fM6052 / f3;
            fMo4394 *= f4;
            fMo4395 *= f4;
        }
        if (fMo4393 < 0.0f || fMo4394 < 0.0f || fMo4395 < 0.0f || fMo4396 < 0.0f) {
            AbstractC4690.m8038("Corner size in Px can't be negative(topStart = " + fMo4393 + ", topEnd = " + fMo4394 + ", bottomEnd = " + fMo4395 + ", bottomStart = " + fMo4396 + ")!");
        }
        if (fMo4393 + fMo4394 + fMo4395 + fMo4396 == 0.0f) {
            return new C2490(AbstractC5568.m9368(0L, j));
        }
        C2793 c2793M9368 = AbstractC5568.m9368(0L, j);
        EnumC2459 enumC24510 = EnumC2459.f8215;
        float f5 = enumC2459 == enumC24510 ? fMo4393 : fMo4394;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
        if (enumC2459 == enumC24510) {
            fMo4393 = fMo4394;
        }
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fMo4393)) << 32) | (((long) Float.floatToRawIntBits(fMo4393)) & 4294967295L);
        float f6 = enumC2459 == enumC24510 ? fMo4395 : fMo4396;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L);
        if (enumC2459 != enumC24510) {
            fMo4396 = fMo4395;
        }
        return new C4996(new C5293(c2793M9368.f9343, c2793M9368.f9342, c2793M9368.f9341, c2793M9368.f9344, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(fMo4396)) << 32) | (((long) Float.floatToRawIntBits(fMo4396)) & 4294967295L)));
    }
}
