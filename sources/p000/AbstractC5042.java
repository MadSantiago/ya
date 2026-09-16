package p000;

/* JADX INFO: renamed from: ۦۘؖٗ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5042 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final InterfaceC0705 f16727 = AbstractC4410.m7702(C4217.f13994, 24.0f);

    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:77:0x011c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0126  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ۥۗ */
    public static final void m8558(final AbstractC0643 abstractC0643, InterfaceC0705 interfaceC0705, final long j, C5362 c5362, final int i, final int i2) {
        AbstractC0643 abstractC0644;
        int i3;
        InterfaceC0705 interfaceC0706;
        boolean z;
        boolean z2;
        final InterfaceC0705 interfaceC0707;
        C5863 c5863M8965;
        int i4;
        C4217 c4217;
        Object objM8999;
        InterfaceC0705 interfaceC0708;
        long jMo1464;
        int i5;
        c5362.m8979(-2142239481);
        if ((i & 6) == 0) {
            abstractC0644 = abstractC0643;
            i3 = (c5362.m8977(abstractC0644) ? 4 : 2) | i;
        } else {
            abstractC0644 = abstractC0643;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c5362.m8963(null) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                interfaceC0706 = interfaceC0705;
                i3 |= c5362.m8963(interfaceC0706) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if (c5362.m8961(j)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            z = true;
            if ((i3 & 1171) != 1170) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (c5362.m9011(i3 & 1, z2)) {
                c5362.m8971();
                i4 = i & 1;
                c4217 = C4217.f13994;
                if (i4 == 0 && !c5362.m8969()) {
                    c5362.m8982();
                } else if (i6 != 0) {
                    interfaceC0706 = c4217;
                }
                InterfaceC0705 interfaceC0709 = interfaceC0706;
                c5362.m8964();
                if ((((i3 & 7168) ^ 3072) > 2048 || !c5362.m8961(j)) && (i3 & 3072) != 2048) {
                }
                objM8999 = c5362.m8999();
                if (z || objM8999 == C2850.f9517) {
                    C1516 c1516 = C4462.m7744(j, C1327.f4591) ? null : new C1516(j, 5);
                    c5362.m8987(c1516);
                    objM8999 = c1516;
                }
                C1516 c1517 = (C1516) objM8999;
                c5362.m8957(-536832197);
                c5362.m9009(false);
                if (C3291.m6053(abstractC0644.mo1464(), 9205357640488583168L)) {
                    interfaceC0708 = f16727;
                } else {
                    jMo1464 = abstractC0644.mo1464();
                    if (Float.isInfinite(Float.intBitsToFloat((int) (jMo1464 >> 32))) || !Float.isInfinite(Float.intBitsToFloat((int) (4294967295L & jMo1464)))) {
                        interfaceC0708 = c4217;
                    } else {
                        interfaceC0708 = f16727;
                    }
                }
                AbstractC1089.m2299(AbstractC4593.m7986(interfaceC0709.mo1571(interfaceC0708), abstractC0644, null, C5473.f18060, 0.0f, c1517, 22).mo1571(c4217), c5362, 0);
                interfaceC0707 = interfaceC0709;
            } else {
                c5362.m8982();
                interfaceC0707 = interfaceC0706;
            }
            c5863M8965 = c5362.m8965();
            if (c5863M8965 != null) {
                c5863M8965.f19365 = new InterfaceC5731() { // from class: ۦِٟؕۨ
                    @Override // p000.InterfaceC5731
                    /* JADX INFO: renamed from: ۥۜ */
                    public final Object mo219(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC5042.m8558(abstractC0643, interfaceC0707, j, (C5362) obj, AbstractC3831.m6835(i | 1), i2);
                        return C2358.f7817;
                    }
                };
            }
        }
        i3 |= 384;
        interfaceC0706 = interfaceC0705;
        if ((i & 3072) == 0) {
            if (c5362.m8961(j)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        z = true;
        if ((i3 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c5362.m9011(i3 & 1, z2)) {
            c5362.m8971();
            i4 = i & 1;
            c4217 = C4217.f13994;
            if (i4 == 0) {
                if (i6 != 0) {
                    interfaceC0706 = c4217;
                }
            } else if (i6 != 0) {
                interfaceC0706 = c4217;
            }
            InterfaceC0705 interfaceC07010 = interfaceC0706;
            c5362.m8964();
            z = ((i3 & 7168) ^ 3072) > 2048 ? false : false;
            objM8999 = c5362.m8999();
            if (z) {
                if (C4462.m7744(j, C1327.f4591)) {
                }
                c5362.m8987(c1516);
                objM8999 = c1516;
            } else {
                if (C4462.m7744(j, C1327.f4591)) {
                }
                c5362.m8987(c1516);
                objM8999 = c1516;
            }
            C1516 c1518 = (C1516) objM8999;
            c5362.m8957(-536832197);
            c5362.m9009(false);
            if (C3291.m6053(abstractC0644.mo1464(), 9205357640488583168L)) {
                jMo1464 = abstractC0644.mo1464();
                if (Float.isInfinite(Float.intBitsToFloat((int) (jMo1464 >> 32)))) {
                }
                interfaceC0708 = c4217;
            } else {
                interfaceC0708 = f16727;
            }
            AbstractC1089.m2299(AbstractC4593.m7986(interfaceC07010.mo1571(interfaceC0708), abstractC0644, null, C5473.f18060, 0.0f, c1518, 22).mo1571(c4217), c5362, 0);
            interfaceC0707 = interfaceC07010;
        } else {
            c5362.m8982();
            interfaceC0707 = interfaceC0706;
        }
        c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new InterfaceC5731() { // from class: ۦِٟؕۨ
                @Override // p000.InterfaceC5731
                /* JADX INFO: renamed from: ۥۜ */
                public final Object mo219(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC5042.m8558(abstractC0643, interfaceC0707, j, (C5362) obj, AbstractC3831.m6835(i | 1), i2);
                    return C2358.f7817;
                }
            };
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final void m8559(C3963 c3963, InterfaceC0705 interfaceC0705, long j, C5362 c5362, int i, int i2) {
        C5362 c5363;
        long j2;
        InterfaceC0705 interfaceC0706;
        long j3;
        InterfaceC0705 interfaceC0707;
        c5362.m8979(-126890956);
        int i3 = (c5362.m8963(c3963) ? 4 : 2) | i | 384 | (((i2 & 8) == 0 && c5362.m8961(j)) ? 2048 : 1024);
        if (c5362.m9011(i3 & 1, (i3 & 1171) != 1170)) {
            c5362.m8971();
            if ((i & 1) == 0 || c5362.m8969()) {
                int i4 = i2 & 8;
                C4217 c4217 = C4217.f13994;
                if (i4 != 0) {
                    j = ((C1327) c5362.m8997(AbstractC0194.f721)).f4595;
                    i3 &= -7169;
                }
                j3 = j;
                interfaceC0707 = c4217;
            } else {
                c5362.m8982();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                interfaceC0707 = interfaceC0705;
                j3 = j;
            }
            c5362.m8964();
            c5363 = c5362;
            m8558(AbstractC4554.m7896(c3963, c5362), interfaceC0707, j3, c5363, 440 | (i3 & 7168), 0);
            interfaceC0706 = interfaceC0707;
            j2 = j3;
        } else {
            c5363 = c5362;
            c5363.m8982();
            j2 = j;
            interfaceC0706 = interfaceC0705;
        }
        C5863 c5863M8965 = c5363.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C4710(c3963, interfaceC0706, j2, i, i2);
        }
    }
}
