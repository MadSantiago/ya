package p000;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: renamed from: ۦۗؖٞۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4978 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public EnumC1806 f16465;

    /* JADX INFO: renamed from: ۥٖ */
    public int f16466;

    /* JADX INFO: renamed from: ۥٙ */
    public final /* synthetic */ InterfaceC4745 f16467;

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ boolean f16468;

    /* JADX INFO: renamed from: ۦٕ */
    public final /* synthetic */ WorkDatabase f16469;

    /* JADX INFO: renamed from: ۦٗ */
    public /* synthetic */ Object f16470;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ boolean f16471;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4978(InterfaceC0443 interfaceC0443, InterfaceC4745 interfaceC4745, WorkDatabase workDatabase, boolean z, boolean z2) {
        super(2, interfaceC0443);
        this.f16471 = z;
        this.f16468 = z2;
        this.f16469 = workDatabase;
        this.f16467 = interfaceC4745;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        C4978 c4978 = new C4978(interfaceC0443, this.f16467, this.f16469, this.f16471, this.f16468);
        c4978.f16470 = obj;
        return c4978;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x009e A[DONT_INVERT, PHI: r0 r12
  0x009e: PHI (r0v11 ۥؒؒؐۦ) = (r0v8 ۥؒؒؐۦ), (r0v16 ۥؒؒؐۦ) binds: [B:37:0x009b, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x009e: PHI (r12v17 java.lang.Object) = (r12v15 java.lang.Object), (r12v0 java.lang.Object) binds: [B:37:0x009b, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c6 A[RETURN] */
    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        EnumC1806 enumC1806;
        InterfaceC0238 interfaceC0238;
        EnumC1806 enumC1807;
        InterfaceC0238 interfaceC0239;
        InterfaceC0238 interfaceC02310;
        Object objMo501;
        Object obj2;
        int i = this.f16466;
        InterfaceC4745 interfaceC4745 = this.f16467;
        WorkDatabase workDatabase = this.f16469;
        boolean z = this.f16468;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        if (i == 0) {
            AbstractC0186.m409(obj);
            InterfaceC0238 interfaceC02311 = (InterfaceC0238) this.f16470;
            if (!this.f16471) {
                return interfaceC4745.mo211(((InterfaceC2755) interfaceC02311).mo466());
            }
            enumC1806 = z ? EnumC1806.f6013 : EnumC1806.f6012;
            if (z) {
                EnumC1806 enumC1808 = enumC1806;
                interfaceC0238 = interfaceC02311;
                enumC1807 = enumC1808;
                C5274 c5274 = new C5274(null, interfaceC4745, 0);
                this.f16470 = interfaceC0238;
                this.f16465 = null;
                this.f16466 = 3;
                obj = interfaceC0238.mo500(enumC1807, c5274, this);
                if (obj != enumC2282) {
                    if (z) {
                        return obj;
                    }
                    this.f16470 = obj;
                    this.f16466 = 4;
                    objMo501 = interfaceC0238.mo501(this);
                    if (objMo501 != enumC2282) {
                        Object obj3 = obj;
                        obj = objMo501;
                        obj2 = obj3;
                        if (!((Boolean) obj).booleanValue()) {
                            C4775 c4775 = workDatabase.f250;
                            if (c4775 != null) {
                            }
                            c4775.f15739.m6607(c4775.f15741, c4775.f15748);
                        }
                        return obj2;
                    }
                }
            } else {
                this.f16470 = interfaceC02311;
                this.f16465 = enumC1806;
                this.f16466 = 1;
                Object objMo502 = interfaceC02311.mo501(this);
                if (objMo502 != enumC2282) {
                    interfaceC0239 = interfaceC02311;
                    obj = objMo502;
                }
            }
            return enumC2282;
        }
        if (i == 1) {
            enumC1806 = this.f16465;
            interfaceC0239 = (InterfaceC0238) this.f16470;
            AbstractC0186.m409(obj);
        } else {
            if (i == 2) {
                enumC1806 = this.f16465;
                interfaceC02310 = (InterfaceC0238) this.f16470;
                AbstractC0186.m409(obj);
                enumC1807 = enumC1806;
                interfaceC0238 = interfaceC02310;
                C5274 c5275 = new C5274(null, interfaceC4745, 0);
                this.f16470 = interfaceC0238;
                this.f16465 = null;
                this.f16466 = 3;
                obj = interfaceC0238.mo500(enumC1807, c5275, this);
                if (obj != enumC2282) {
                    if (z) {
                        return obj;
                    }
                    this.f16470 = obj;
                    this.f16466 = 4;
                    objMo501 = interfaceC0238.mo501(this);
                    if (objMo501 != enumC2282) {
                        Object obj4 = obj;
                        obj = objMo501;
                        obj2 = obj4;
                    }
                }
                return enumC2282;
            }
            if (i == 3) {
                interfaceC0238 = (InterfaceC0238) this.f16470;
                AbstractC0186.m409(obj);
                if (z) {
                    return obj;
                }
                this.f16470 = obj;
                this.f16466 = 4;
                objMo501 = interfaceC0238.mo501(this);
                if (objMo501 != enumC2282) {
                    Object obj5 = obj;
                    obj = objMo501;
                    obj2 = obj5;
                }
                return enumC2282;
            }
            if (i != 4) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = this.f16470;
            AbstractC0186.m409(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            C4775 c4776 = workDatabase.f250;
            C4775 c4777 = c4776 != null ? c4776 : null;
            c4777.f15739.m6607(c4777.f15741, c4777.f15748);
        }
        return obj2;
        if (((Boolean) obj).booleanValue()) {
            enumC1807 = enumC1806;
            interfaceC0238 = interfaceC0239;
            C5274 c5276 = new C5274(null, interfaceC4745, 0);
            this.f16470 = interfaceC0238;
            this.f16465 = null;
            this.f16466 = 3;
            obj = interfaceC0238.mo500(enumC1807, c5276, this);
            if (obj != enumC2282) {
                if (z) {
                    return obj;
                }
                this.f16470 = obj;
                this.f16466 = 4;
                objMo501 = interfaceC0238.mo501(this);
                if (objMo501 != enumC2282) {
                    Object obj6 = obj;
                    obj = objMo501;
                    obj2 = obj6;
                    if (!((Boolean) obj).booleanValue()) {
                        C4775 c4778 = workDatabase.f250;
                        if (c4778 != null) {
                        }
                        c4777.f15739.m6607(c4777.f15741, c4777.f15748);
                    }
                    return obj2;
                }
            }
        } else {
            C4775 c4779 = workDatabase.f250;
            if (c4779 == null) {
                c4779 = null;
            }
            this.f16470 = interfaceC0239;
            this.f16465 = enumC1806;
            this.f16466 = 2;
            if (c4779.m8159(this) != enumC2282) {
                interfaceC02310 = interfaceC0239;
                enumC1807 = enumC1806;
                interfaceC0238 = interfaceC02310;
                C5274 c5277 = new C5274(null, interfaceC4745, 0);
                this.f16470 = interfaceC0238;
                this.f16465 = null;
                this.f16466 = 3;
                obj = interfaceC0238.mo500(enumC1807, c5277, this);
                if (obj != enumC2282) {
                    if (z) {
                        return obj;
                    }
                    this.f16470 = obj;
                    this.f16466 = 4;
                    objMo501 = interfaceC0238.mo501(this);
                    if (objMo501 != enumC2282) {
                        Object obj7 = obj;
                        obj = objMo501;
                        obj2 = obj7;
                        if (!((Boolean) obj).booleanValue()) {
                            C4775 c47710 = workDatabase.f250;
                            if (c47710 != null) {
                            }
                            c4777.f15739.m6607(c4777.f15741, c4777.f15748);
                        }
                        return obj2;
                    }
                }
            }
        }
        return enumC2282;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        return ((C4978) mo217((InterfaceC0443) obj2, (InterfaceC0238) obj)).mo218(C2358.f7817);
    }
}
