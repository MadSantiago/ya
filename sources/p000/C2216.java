package p000;

/* JADX INFO: renamed from: ۥۙؔؗؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2216 extends AbstractC5381 implements InterfaceC4933, InterfaceC0951 {

    /* JADX INFO: renamed from: ۥً */
    public AbstractC0643 f7347;

    /* JADX INFO: renamed from: ۥٕ */
    public InterfaceC5807 f7348;

    /* JADX INFO: renamed from: ۥۙ */
    public InterfaceC1133 f7349;

    /* JADX INFO: renamed from: ۦؖ */
    public C1516 f7350;

    /* JADX INFO: renamed from: ۦؙ */
    public float f7351;

    /* JADX INFO: renamed from: ۦٚ */
    public boolean f7352;

    /* JADX INFO: renamed from: ۥؒ */
    public static boolean m4276(long j) {
        return !C3291.m6053(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    /* JADX INFO: renamed from: ۥٜ */
    public static boolean m4277(long j) {
        return !C3291.m6053(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.f7347 + ", sizeToIntrinsics=" + this.f7352 + ", alignment=" + this.f7348 + ", alpha=" + this.f7351 + ", colorFilter=" + this.f7350 + ')';
    }

    /* JADX INFO: renamed from: ۥؐ */
    public final long m4278(long j) {
        boolean z = false;
        boolean z2 = C3693.m6548(j) && C3693.m6553(j);
        if (C3693.m6558(j) && C3693.m6549(j)) {
            z = true;
        }
        if ((!m4279() && z2) || z) {
            return C3693.m6550(j, C3693.m6556(j), 0, C3693.m6551(j), 0, 10);
        }
        long jMo1464 = this.f7347.mo1464();
        int iRound = m4276(jMo1464) ? Math.round(Float.intBitsToFloat((int) (jMo1464 >> 32))) : C3693.m6557(j);
        int iRound2 = m4277(jMo1464) ? Math.round(Float.intBitsToFloat((int) (jMo1464 & 4294967295L))) : C3693.m6555(j);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(AbstractC0671.m1493(j, iRound2))) & 4294967295L) | (((long) Float.floatToRawIntBits(AbstractC0671.m1502(j, iRound))) << 32);
        if (m4279()) {
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(!m4276(this.f7347.mo1464()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.f7347.mo1464() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!m4277(this.f7347.mo1464()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.f7347.mo1464() & 4294967295L)))) & 4294967295L);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : AbstractC2776.m5230(jFloatToRawIntBits2, this.f7349.mo2390(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return C3693.m6550(j, AbstractC0671.m1502(j, Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)))), 0, AbstractC0671.m1493(j, Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)))), 0, 10);
    }

    /* JADX INFO: renamed from: ۥؑ */
    public final boolean m4279() {
        return this.f7352 && this.f7347.mo1464() != 9205357640488583168L;
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۥً */
    public final int mo1554(AbstractC3625 abstractC3625, InterfaceC1827 interfaceC1827, int i) {
        if (!m4279()) {
            return interfaceC1827.mo3596(i);
        }
        long jM4278 = m4278(AbstractC0671.m1494(0, i, 0, 0, 13));
        return Math.max(C3693.m6555(jM4278), interfaceC1827.mo3596(i));
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC5370 mo931(InterfaceC2427 interfaceC2427, InterfaceC1827 interfaceC1827, long j) {
        AbstractC0275 abstractC0275Mo3597 = interfaceC1827.mo3597(m4278(j));
        return interfaceC2427.mo755(abstractC0275Mo3597.f985, abstractC0275Mo3597.f984, C0204.f751, new C0778(abstractC0275Mo3597, 5));
    }

    @Override // p000.InterfaceC0951
    /* JADX INFO: renamed from: ۥٛ */
    public final void mo1726(C2497 c2497) {
        C2004 c2004 = c2497.f8304;
        long jMo1464 = this.f7347.mo1464();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(m4276(jMo1464) ? Float.intBitsToFloat((int) (jMo1464 >> 32)) : Float.intBitsToFloat((int) (c2004.mo4567() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(m4277(jMo1464) ? Float.intBitsToFloat((int) (jMo1464 & 4294967295L)) : Float.intBitsToFloat((int) (c2004.mo4567() & 4294967295L)))) & 4294967295L);
        long jM5230 = (Float.intBitsToFloat((int) (c2004.mo4567() >> 32)) == 0.0f || Float.intBitsToFloat((int) (c2004.mo4567() & 4294967295L)) == 0.0f) ? 0L : AbstractC2776.m5230(jFloatToRawIntBits, this.f7349.mo2390(jFloatToRawIntBits, c2004.mo4567()));
        long jMo608 = this.f7348.mo608((((long) Math.round(Float.intBitsToFloat((int) (jM5230 >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jM5230 & 4294967295L)))) & 4294967295L), (((long) Math.round(Float.intBitsToFloat((int) (c2004.mo4567() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (c2004.mo4567() & 4294967295L)))) & 4294967295L), c2497.getLayoutDirection());
        float f = (int) (jMo608 >> 32);
        float f2 = (int) (jMo608 & 4294967295L);
        ((C5086) c2004.f6603.f9378).m8699(f, f2);
        try {
            this.f7347.m1460(c2497, jM5230, this.f7351, this.f7350);
            ((C5086) c2004.f6603.f9378).m8699(-f, -f2);
            c2497.m4644();
        } catch (Throwable th) {
            ((C5086) c2004.f6603.f9378).m8699(-f, -f2);
            throw th;
        }
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۥ۟ */
    public final int mo1555(AbstractC3625 abstractC3625, InterfaceC1827 interfaceC1827, int i) {
        if (!m4279()) {
            return interfaceC1827.mo3600(i);
        }
        long jM4278 = m4278(AbstractC0671.m1494(0, 0, 0, i, 7));
        return Math.max(C3693.m6557(jM4278), interfaceC1827.mo3600(i));
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦؘ */
    public final boolean mo786() {
        return false;
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۦۙ */
    public final int mo1556(AbstractC3625 abstractC3625, InterfaceC1827 interfaceC1827, int i) {
        if (!m4279()) {
            return interfaceC1827.mo3599(i);
        }
        long jM4278 = m4278(AbstractC0671.m1494(0, 0, 0, i, 7));
        return Math.max(C3693.m6557(jM4278), interfaceC1827.mo3599(i));
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۦ۟ */
    public final int mo1557(AbstractC3625 abstractC3625, InterfaceC1827 interfaceC1827, int i) {
        if (!m4279()) {
            return interfaceC1827.mo3598(i);
        }
        long jM4278 = m4278(AbstractC0671.m1494(0, i, 0, 0, 13));
        return Math.max(C3693.m6555(jM4278), interfaceC1827.mo3598(i));
    }
}
