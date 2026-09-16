package p000;

import android.view.KeyEvent;

/* JADX INFO: renamed from: ۥؔ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0006 extends AbstractC3019 implements InterfaceC2766, InterfaceC0174, InterfaceC5671, InterfaceC0289, InterfaceC4825, InterfaceC0349, InterfaceC5119, InterfaceC0124 {

    /* JADX INFO: renamed from: ۥۥ */
    public static final C0373 f1320 = new C0373(24);

    /* JADX INFO: renamed from: ۥؔ */
    public InterfaceC3016 f1321;

    /* JADX INFO: renamed from: ۥؙ */
    public boolean f1322;

    /* JADX INFO: renamed from: ۥؚ */
    public C2243 f1323;

    /* JADX INFO: renamed from: ۥٕ */
    public C2243 f1324;

    /* JADX INFO: renamed from: ۥ٘ */
    public InterfaceC3975 f1325;

    /* JADX INFO: renamed from: ۥٛ */
    public C3656 f1326;

    /* JADX INFO: renamed from: ۥٝ */
    public long f1327;

    /* JADX INFO: renamed from: ۥۙ */
    public InterfaceC3016 f1328;

    /* JADX INFO: renamed from: ۥ۟ */
    public C3656 f1329;

    /* JADX INFO: renamed from: ۥۡ */
    public C2127 f1330;

    /* JADX INFO: renamed from: ۥۤ */
    public C0266 f1331;

    /* JADX INFO: renamed from: ۥۦ */
    public C2155 f1332;

    /* JADX INFO: renamed from: ۦؒ */
    public final C2918 f1333;

    /* JADX INFO: renamed from: ۦؖ */
    public String f1334;

    /* JADX INFO: renamed from: ۦؗ */
    public boolean f1335;

    /* JADX INFO: renamed from: ۦؙ */
    public boolean f1336;

    /* JADX INFO: renamed from: ۦُ */
    public InterfaceC4448 f1337;

    /* JADX INFO: renamed from: ۦٖ */
    public final C3165 f1338;

    /* JADX INFO: renamed from: ۦۜ */
    public C2439 f1339;

    /* JADX INFO: renamed from: ۦۣ */
    public C4774 f1340;

    /* JADX INFO: renamed from: ۦۧ */
    public final C0373 f1341;

    public AbstractC0006(C2243 c2243, InterfaceC3016 interfaceC3016, boolean z, boolean z2, String str, C2155 c2155, InterfaceC4448 interfaceC4448) {
        this.f1324 = c2243;
        this.f1328 = interfaceC3016;
        this.f1336 = z;
        this.f1334 = str;
        this.f1332 = c2155;
        this.f1335 = z2;
        this.f1337 = interfaceC4448;
        this.f1338 = new C3165(c2243, 0, new C0037(1, this, AbstractC0006.class, "onFocusChange", "onFocusChange(Z)V", 0, 0));
        int i = AbstractC3481.f11559;
        this.f1333 = new C2918(6);
        this.f1327 = 0L;
        C2243 c2244 = this.f1324;
        this.f1323 = c2244;
        this.f1322 = c2244 == null;
        this.f1341 = f1320;
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۥ */
    public final void mo780() {
        mo772();
        if (!this.f1322) {
            m9749();
        }
        if (this.f1335) {
            m5603(this.f1338);
        }
    }

    /* JADX INFO: renamed from: ۥؐۦً, reason: contains not printable characters */
    public final void m9749() {
        if (this.f1325 != null) {
            return;
        }
        InterfaceC3016 interfaceC3016 = this.f1336 ? this.f1321 : this.f1328;
        if (interfaceC3016 != null) {
            C2243 c2243 = this.f1324;
            if (c2243 == null) {
                c2243 = new C2243();
                this.f1324 = c2243;
            }
            this.f1338.m5842(c2243);
            InterfaceC3975 interfaceC3975Mo1307 = interfaceC3016.mo1307(this.f1324);
            m5603(interfaceC3975Mo1307);
            this.f1325 = interfaceC3975Mo1307;
        }
    }

    /* JADX INFO: renamed from: ۥٌٍۣؕ, reason: contains not printable characters */
    public final void m9750(C3536 c3536) {
        boolean z;
        C2243 c2243 = this.f1324;
        if (c2243 != null) {
            C3656 c3656 = new C3656(c3536.f11726);
            int i = 0;
            C4036 c4036 = C4774.f15737;
            boolean z2 = true;
            if (c3536 == null) {
                InterfaceC0289 interfaceC0289M9068 = AbstractC5378.m9068(this, c4036);
                C4774 c4774 = interfaceC0289M9068 instanceof C4774 ? (C4774) interfaceC0289M9068 : null;
                z = (c4774 != null ? c4774.f15738 : null) != null;
            } else {
                C5662 c5662 = new C5662();
                AbstractC5378.m9053(this, c4036, new C3282(new C0079(11, c3536, c5662), i));
                z = c5662.f18631;
            }
            if (!z && !AbstractC4899.m8239(this)) {
                z2 = false;
            }
            InterfaceC0443 interfaceC0443 = null;
            if (z2) {
                this.f1330 = AbstractC2765.m5135(m9076(), null, 0, new C0059(c2243, c3656, this, interfaceC0443, 1), 3);
            } else {
                this.f1326 = c3656;
                AbstractC2765.m5135(m9076(), null, 0, new C0048(c2243, c3656, interfaceC0443, 2), 3);
            }
        }
    }

    @Override // p000.InterfaceC0289
    /* JADX INFO: renamed from: ۥٓ */
    public final Object mo612() {
        return this.f1341;
    }

    /* JADX INFO: renamed from: ۥٔؗۢؐ, reason: contains not printable characters */
    public abstract boolean mo9751(KeyEvent keyEvent);

    /* JADX INFO: renamed from: ۥٟ */
    public final long m782(long j) {
        long jMo747 = AbstractC5537.m9270(this).f2236.mo747(((InterfaceC2509) AbstractC2552.m4807(this, AbstractC2853.f9541)).mo4660());
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jMo747 >> 32)) - ((int) (j >> 32))) / 2.0f;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo747 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0077 A[RETURN] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.InterfaceC0174
    /* JADX INFO: renamed from: ۥۡ */
    public final boolean mo363(KeyEvent keyEvent) {
        boolean z;
        m9749();
        long jM3030 = AbstractC1434.m3030(keyEvent);
        boolean z2 = this.f1335;
        int i = 3;
        InterfaceC0443 interfaceC0443 = null;
        C2918 c2918 = this.f1333;
        if (z2) {
            int i2 = 2;
            if (AbstractC1434.m3056(keyEvent) == 2 && AbstractC0186.m437(keyEvent)) {
                if (c2918.m5501(jM3030)) {
                    z = false;
                } else {
                    C3656 c3656 = new C3656(this.f1327);
                    c2918.m5504(jM3030, c3656);
                    if (this.f1324 != null) {
                        AbstractC2765.m5135(m9076(), null, 0, new C0068(this, c3656, interfaceC0443, i2), 3);
                    }
                    z = true;
                }
                if (mo9751(keyEvent) || z) {
                    return true;
                }
                return false;
            }
        }
        if (this.f1335 && AbstractC1434.m3056(keyEvent) == 1 && AbstractC0186.m437(keyEvent)) {
            C3656 c3657 = (C3656) c2918.m5500(jM3030);
            if (c3657 != null) {
                if (this.f1324 != null) {
                    AbstractC2765.m5135(m9076(), null, 0, new C0068(this, c3657, interfaceC0443, i), 3);
                }
                mo9752(keyEvent);
            }
            if (c3657 != null) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC2766
    /* JADX INFO: renamed from: ۦؓ */
    public void mo783() {
        C0266 c0266;
        C2243 c2243 = this.f1324;
        if (c2243 != null && (c0266 = this.f1331) != null) {
            c2243.m4291(new C5116(c0266));
        }
        this.f1331 = null;
        C2439 c2439 = this.f1339;
        if (c2439 != null) {
            c2439.mo783();
        }
    }

    /* JADX INFO: renamed from: ۦؕ */
    public C2439 mo784() {
        return null;
    }

    @Override // p000.InterfaceC2766
    /* JADX INFO: renamed from: ۦؗ */
    public void mo785(C5639 c5639, EnumC3834 enumC3834, long j) {
        C2439 c2439Mo784;
        long j2 = ((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L);
        this.f1327 = (((long) Float.floatToRawIntBits((int) (j2 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L);
        m9749();
        if (this.f1335) {
            if (this.f1340 == null) {
                C4774 c4774 = new C4774(this);
                m5603(c4774);
                this.f1340 = c4774;
            }
            if (enumC3834 == EnumC3834.f12724) {
                int i = c5639.f18581;
                int i2 = 0;
                InterfaceC0443 interfaceC0443 = null;
                if (i == 4) {
                    AbstractC2765.m5135(m9076(), null, 0, new C0075(this, interfaceC0443, i2), 3);
                } else if (i == 5) {
                    AbstractC2765.m5135(m9076(), null, 0, new C0075(this, interfaceC0443, 1), 3);
                }
            }
        }
        if (this.f1339 == null && (c2439Mo784 = mo784()) != null) {
            m5603(c2439Mo784);
            this.f1339 = c2439Mo784;
        }
        C2439 c2439 = this.f1339;
        if (c2439 != null) {
            c2439.mo785(c5639, enumC3834, j);
        }
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦؘ */
    public final boolean mo786() {
        return false;
    }

    @Override // p000.InterfaceC0174
    /* JADX INFO: renamed from: ۦؚ */
    public final boolean mo364(KeyEvent keyEvent) {
        return false;
    }

    @Override // p000.InterfaceC5671
    /* JADX INFO: renamed from: ۦَ */
    public final boolean mo787() {
        return true;
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦٓ */
    public final void mo788() {
        m789();
        if (this.f1323 == null) {
            this.f1324 = null;
        }
        InterfaceC3975 interfaceC3975 = this.f1325;
        if (interfaceC3975 != null) {
            m5607(interfaceC3975);
        }
        this.f1325 = null;
        C4774 c4774 = this.f1340;
        if (c4774 != null) {
            m5607(c4774);
        }
        this.f1340 = null;
    }

    @Override // p000.InterfaceC0349
    /* JADX INFO: renamed from: ۦٖ */
    public final void mo772() {
        if (this.f1336) {
            AbstractC5568.m9359(this, new C0013(this, 0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0073 A[LOOP:0: B:16:0x0037->B:26:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0076 A[EDGE_INSN: B:30:0x0076->B:27:0x0076 BREAK  A[LOOP:0: B:16:0x0037->B:26:0x0073], SYNTHETIC] */
    /* JADX INFO: renamed from: ۦ٘ */
    public final void m789() {
        C2243 c2243 = this.f1324;
        C2918 c2918 = this.f1333;
        if (c2243 != null) {
            C3656 c3656 = this.f1326;
            if (c3656 != null) {
                c2243.m4291(new C0199(c3656));
            }
            C3656 c3657 = this.f1329;
            if (c3657 != null) {
                c2243.m4291(new C0199(c3657));
            }
            C0266 c0266 = this.f1331;
            if (c0266 != null) {
                c2243.m4291(new C5116(c0266));
            }
            Object[] objArr = c2918.f9783;
            long[] jArr = c2918.f9787;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                c2243.m4291(new C0199((C3656) objArr[(i << 3) + i3]));
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        this.f1326 = null;
        this.f1329 = null;
        this.f1331 = null;
        c2918.m5502();
    }

    @Override // p000.InterfaceC5671
    /* JADX INFO: renamed from: ۦٟ */
    public final void mo790(InterfaceC1066 interfaceC1066) {
        C2155 c2155 = this.f1332;
        if (c2155 != null) {
            AbstractC3992.m7135(interfaceC1066, c2155.f7116);
        }
        String str = this.f1334;
        C0013 c0013 = new C0013(this, 1);
        InterfaceC0504[] interfaceC0504Arr = AbstractC3992.f13322;
        interfaceC1066.mo2266(AbstractC0208.f772, new C0078(str, c0013));
        if (this.f1335) {
            this.f1338.mo790(interfaceC1066);
        } else {
            interfaceC1066.mo2266(AbstractC2771.f9223, C2358.f7817);
        }
        mo781(interfaceC1066);
    }

    /* JADX INFO: renamed from: ۦۘ */
    public final void m791(boolean z) {
        C2243 c2243 = this.f1324;
        if (c2243 != null) {
            C2127 c2127 = this.f1330;
            InterfaceC0443 interfaceC0443 = null;
            if (c2127 == null || !c2127.mo866()) {
                C3656 c3656 = z ? this.f1329 : this.f1326;
                if (c3656 != null) {
                    C0199 c0199 = new C0199(c3656);
                    InterfaceC3196 interfaceC3196 = (InterfaceC3196) ((C3950) m9076()).f13208.mo865(C1397.f4791);
                    AbstractC2765.m5135(m9076(), null, 0, new C0061(c2243, c0199, interfaceC3196 != null ? interfaceC3196.mo859(new C0079(0, c2243, c0199)) : null, interfaceC0443, 0), 3);
                }
            } else {
                C2127 c2128 = this.f1330;
                if (c2128 != null) {
                    c2128.mo871(null);
                }
            }
            if (z) {
                this.f1329 = null;
            } else {
                this.f1326 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۦۡؔ۟ؓ, reason: contains not printable characters */
    public abstract void mo9752(KeyEvent keyEvent);

    /* JADX INFO: renamed from: ۦًۢؖۡ, reason: contains not printable characters */
    public final void m9753(C3410 c3410) {
        C2243 c2243 = this.f1324;
        if (c2243 != null) {
            C3656 c3656 = new C3656(c3410.f11346);
            C5662 c5662 = new C5662();
            AbstractC5378.m9053(this, C4774.f15737, new C3282(new C0079(10, c3410, c5662), 0));
            InterfaceC0443 interfaceC0443 = null;
            if (c5662.f18631 || AbstractC4899.m8239(this)) {
                this.f1330 = AbstractC2765.m5135(m9076(), null, 0, new C0059(c2243, c3656, this, interfaceC0443, 0), 3);
            } else {
                this.f1329 = c3656;
                AbstractC2765.m5135(m9076(), null, 0, new C0048(c2243, c3656, interfaceC0443, 1), 3);
            }
        }
    }

    /* JADX INFO: renamed from: ۦُۣؔۚ, reason: contains not printable characters */
    public final void m9754(C2243 c2243, InterfaceC3016 interfaceC3016, boolean z, boolean z2, String str, C2155 c2155, InterfaceC4448 interfaceC4448) {
        boolean z3;
        boolean z4;
        InterfaceC3975 interfaceC3975;
        boolean z5 = true;
        if (AbstractC3831.m6874(this.f1323, c2243)) {
            z3 = false;
        } else {
            m789();
            this.f1323 = c2243;
            this.f1324 = c2243;
            z3 = true;
        }
        if (!AbstractC3831.m6874(this.f1328, interfaceC3016)) {
            this.f1328 = interfaceC3016;
            z3 = true;
        }
        if (this.f1336 != z) {
            this.f1336 = z;
            if (z) {
                mo772();
            }
            z3 = true;
        }
        boolean z6 = this.f1335;
        C3165 c3165 = this.f1338;
        if (z6 != z2) {
            if (z2) {
                m5603(c3165);
            } else {
                m5607(c3165);
                m789();
            }
            AbstractC0186.m412(this);
            this.f1335 = z2;
        }
        if (!AbstractC3831.m6874(this.f1334, str)) {
            this.f1334 = str;
            AbstractC0186.m412(this);
        }
        if (!AbstractC3831.m6874(this.f1332, c2155)) {
            this.f1332 = c2155;
            AbstractC0186.m412(this);
        }
        this.f1337 = interfaceC4448;
        boolean z7 = this.f1322;
        C2243 c2244 = this.f1323;
        if (z7 == (c2244 == null)) {
            z5 = z3;
            z4 = z7;
        } else {
            z4 = c2244 == null;
            this.f1322 = z4;
            if (z4 || this.f1325 != null) {
                z7 = z4;
                z5 = z3;
                z4 = z7;
            }
        }
        if (z5 && ((interfaceC3975 = this.f1325) != null || !z4)) {
            if (interfaceC3975 != null) {
                m5607(interfaceC3975);
            }
            this.f1325 = null;
            m9749();
        }
        c3165.m5842(this.f1324);
    }

    /* JADX INFO: renamed from: ۦۥ */
    public final void m792(long j, boolean z) {
        C2243 c2243 = this.f1324;
        if (c2243 != null) {
            C2127 c2127 = this.f1330;
            if (c2127 == null || !c2127.mo866()) {
                C3656 c3656 = z ? this.f1329 : this.f1326;
                if (c3656 != null) {
                    AbstractC2765.m5135(m9076(), null, 0, new C0048(c3656, c2243, null), 3);
                }
            } else {
                c2127.mo871(null);
                AbstractC2765.m5135(m9076(), null, 0, new C0058(c2127, j, c2243, (InterfaceC0443) null, 0), 3);
            }
            if (z) {
                this.f1329 = null;
            } else {
                this.f1326 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۦؘّۨؕ, reason: contains not printable characters */
    public void mo9755() {
    }

    /* JADX INFO: renamed from: ۥؐ */
    public void mo781(InterfaceC1066 interfaceC1066) {
    }
}
