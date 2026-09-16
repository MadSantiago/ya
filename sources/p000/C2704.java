package p000;

/* JADX INFO: renamed from: ۥؙْۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2704 implements InterfaceC3128 {
    @Override // p000.InterfaceC3128
    /* JADX INFO: renamed from: ۥُ */
    public final int mo5027() {
        return 16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r7v0, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r7v1, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // p000.InterfaceC3128
    /* JADX INFO: renamed from: ۦؑ */
    public final boolean mo5028(AbstractC5381 abstractC5381) {
        ?? c0863 = 0;
        while (true) {
            int i = 0;
            if (abstractC5381 == 0) {
                return false;
            }
            if (abstractC5381 instanceof InterfaceC2766) {
                ((InterfaceC2766) abstractC5381).mo5169();
            } else if ((abstractC5381.f17781 & 16) != 0 && (abstractC5381 instanceof AbstractC3019)) {
                AbstractC5381 abstractC5382 = ((AbstractC3019) abstractC5381).f10167;
                c0863 = c0863;
                abstractC5381 = abstractC5381;
                while (abstractC5382 != null) {
                    if ((abstractC5382.f17781 & 16) != 0) {
                        i++;
                        if (i == 1) {
                            c0863 = c0863;
                            abstractC5381 = abstractC5382;
                        } else {
                            if (c0863 == 0) {
                                c0863 = new C0863(new AbstractC5381[16]);
                            }
                            if (abstractC5381 != 0) {
                                c0863.m1843(abstractC5381);
                                abstractC5381 = 0;
                            }
                            c0863.m1843(abstractC5382);
                        }
                    }
                    abstractC5382 = abstractC5382.f17783;
                    c0863 = c0863;
                    abstractC5381 = abstractC5381;
                }
                if (i == 1) {
                }
            }
            abstractC5381 = AbstractC5537.m9233(c0863);
        }
    }

    @Override // p000.InterfaceC3128
    /* JADX INFO: renamed from: ۦؚ */
    public final boolean mo5029(C0605 c0605) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // p000.InterfaceC3128
    /* JADX INFO: renamed from: ۦِ */
    public final boolean mo5030(C0679 c0679, C0605 c0605) {
        AbstractC1311 abstractC1311 = (AbstractC1311) c0605.f2256.f8201;
        abstractC1311.getClass();
        AbstractC5381 abstractC5381M2810 = abstractC1311.m2810(AbstractC5490.m9196(16));
        if (abstractC5381M2810 != null && abstractC5381M2810.f17786) {
            if (!abstractC5381M2810.f17791.f17786) {
                AbstractC3480.m6278("visitLocalDescendants called on an unattached node");
            }
            AbstractC5381 abstractC5381 = abstractC5381M2810.f17791;
            if ((abstractC5381.f17782 & 16) != 0) {
                while (abstractC5381 != null) {
                    if ((abstractC5381.f17781 & 16) != 0) {
                        ?? M9233 = abstractC5381;
                        ?? c0863 = 0;
                        while (M9233 != 0) {
                            if (M9233 instanceof InterfaceC2766) {
                                if (((InterfaceC2766) M9233).mo5168()) {
                                    c0679.f2482 = c0679.f2484.f9040 - 1;
                                    return true;
                                }
                            } else if ((M9233.f17781 & 16) != 0 && (M9233 instanceof AbstractC3019)) {
                                AbstractC5381 abstractC5382 = ((AbstractC3019) M9233).f10167;
                                int i = 0;
                                while (abstractC5382 != null) {
                                    if ((abstractC5382.f17781 & 16) != 0) {
                                        i++;
                                        if (i == 1) {
                                            M9233 = M9233;
                                            c0863 = c0863;
                                            c0863 = c0863;
                                            M9233 = abstractC5382;
                                        } else {
                                            if (c0863 == 0) {
                                                c0863 = new C0863(new AbstractC5381[16]);
                                            }
                                            if (M9233 != 0) {
                                                c0863.m1843(M9233);
                                                M9233 = 0;
                                            }
                                            c0863.m1843(abstractC5382);
                                        }
                                    } else {
                                        M9233 = M9233;
                                        c0863 = c0863;
                                    }
                                    abstractC5382 = abstractC5382.f17783;
                                    M9233 = M9233;
                                    c0863 = c0863;
                                }
                                if (i == 1) {
                                    M9233 = M9233;
                                    c0863 = c0863;
                                } else {
                                    M9233 = M9233;
                                    c0863 = c0863;
                                }
                            }
                            M9233 = AbstractC5537.m9233(c0863);
                        }
                    }
                    abstractC5381 = abstractC5381.f17783;
                }
            }
        }
        return false;
    }

    @Override // p000.InterfaceC3128
    /* JADX INFO: renamed from: ۦٛ */
    public final void mo5031(C0605 c0605, long j, C0679 c0679, int i, boolean z) {
        c0605.m1317(j, c0679, i, z);
    }
}
