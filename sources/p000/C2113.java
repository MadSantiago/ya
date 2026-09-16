package p000;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: renamed from: ۥۗؕؕؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2113 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public EnumC1806 f6936;

    /* JADX INFO: renamed from: ۥٖ */
    public int f6937;

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ WorkDatabase f6938;

    /* JADX INFO: renamed from: ۦٕ */
    public final /* synthetic */ InterfaceC4745 f6939;

    /* JADX INFO: renamed from: ۦٗ */
    public /* synthetic */ Object f6940;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ boolean f6941;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2113(InterfaceC0443 interfaceC0443, InterfaceC4745 interfaceC4745, WorkDatabase workDatabase, boolean z) {
        super(2, interfaceC0443);
        this.f6941 = z;
        this.f6938 = workDatabase;
        this.f6939 = interfaceC4745;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        C2113 c2113 = new C2113(interfaceC0443, this.f6939, this.f6938, this.f6941);
        c2113.f6940 = obj;
        return c2113;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0071 A[PHI: r0 r12
  0x0071: PHI (r0v6 ۥؒؒؐۦ) = (r0v3 ۥؒؒؐۦ), (r0v10 ۥؒؒؐۦ) binds: [B:26:0x006e, B:12:0x0024] A[DONT_GENERATE, DONT_INLINE]
  0x0071: PHI (r12v11 java.lang.Object) = (r12v9 java.lang.Object), (r12v0 java.lang.Object) binds: [B:26:0x006e, B:12:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x0075  */
    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0090  */
    /* JADX WARN: Code duplicated, block: B:42:0x009b A[RETURN] */
    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        EnumC1806 enumC1806;
        EnumC1806 enumC1807;
        InterfaceC0238 interfaceC0238;
        InterfaceC0238 interfaceC0239;
        Object objMo501;
        Object obj2;
        int i = this.f6937;
        InterfaceC4745 interfaceC4745 = this.f6939;
        if (i == 0) {
            AbstractC0186.m409(obj);
            return interfaceC4745.mo211(((InterfaceC2755) ((InterfaceC0238) this.f6940)).mo466());
        }
        WorkDatabase workDatabase = this.f6938;
        int i2 = 1;
        byte b = 0;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        if (i != 1) {
            if (i == 2) {
                enumC1806 = this.f6936;
                interfaceC0239 = (InterfaceC0238) this.f6940;
                AbstractC0186.m409(obj);
            } else {
                if (i == 3) {
                    interfaceC0238 = (InterfaceC0238) this.f6940;
                    AbstractC0186.m409(obj);
                    if (this.f6941) {
                        return obj;
                    }
                    this.f6940 = obj;
                    this.f6937 = 4;
                    objMo501 = interfaceC0238.mo501(this);
                    if (objMo501 != enumC2282) {
                        Object obj3 = obj;
                        obj = objMo501;
                        obj2 = obj3;
                    }
                    return enumC2282;
                }
                if (i != 4) {
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = this.f6940;
                AbstractC0186.m409(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                C4775 c4775 = workDatabase.f250;
                C4775 c4776 = c4775 != null ? c4775 : null;
                c4776.f15739.m6607(c4776.f15741, c4776.f15748);
            }
            return obj2;
        }
        enumC1806 = this.f6936;
        InterfaceC0238 interfaceC02310 = (InterfaceC0238) this.f6940;
        AbstractC0186.m409(obj);
        if (((Boolean) obj).booleanValue()) {
            enumC1807 = enumC1806;
            interfaceC0238 = interfaceC02310;
            C5274 c5274 = new C5274(b == true ? 1 : 0, interfaceC4745, i2);
            this.f6940 = interfaceC0238;
            this.f6936 = null;
            this.f6937 = 3;
            obj = interfaceC0238.mo500(enumC1807, c5274, this);
            if (obj != enumC2282) {
                if (this.f6941) {
                    return obj;
                }
                this.f6940 = obj;
                this.f6937 = 4;
                objMo501 = interfaceC0238.mo501(this);
                if (objMo501 != enumC2282) {
                    Object obj4 = obj;
                    obj = objMo501;
                    obj2 = obj4;
                    if (!((Boolean) obj).booleanValue()) {
                        C4775 c4777 = workDatabase.f250;
                        if (c4777 != null) {
                        }
                        c4776.f15739.m6607(c4776.f15741, c4776.f15748);
                    }
                    return obj2;
                }
            }
        } else {
            C4775 c4778 = workDatabase.f250;
            if (c4778 == null) {
                c4778 = null;
            }
            this.f6940 = interfaceC02310;
            this.f6936 = enumC1806;
            this.f6937 = 2;
            if (c4778.m8159(this) != enumC2282) {
                interfaceC0239 = interfaceC02310;
            }
        }
        return enumC2282;
        enumC1807 = enumC1806;
        interfaceC0238 = interfaceC0239;
        C5274 c5275 = new C5274(b == true ? 1 : 0, interfaceC4745, i2);
        this.f6940 = interfaceC0238;
        this.f6936 = null;
        this.f6937 = 3;
        obj = interfaceC0238.mo500(enumC1807, c5275, this);
        if (obj != enumC2282) {
            if (this.f6941) {
                return obj;
            }
            this.f6940 = obj;
            this.f6937 = 4;
            objMo501 = interfaceC0238.mo501(this);
            if (objMo501 != enumC2282) {
                Object obj5 = obj;
                obj = objMo501;
                obj2 = obj5;
                if (!((Boolean) obj).booleanValue()) {
                    C4775 c4779 = workDatabase.f250;
                    if (c4779 != null) {
                    }
                    c4776.f15739.m6607(c4776.f15741, c4776.f15748);
                }
                return obj2;
            }
        }
        return enumC2282;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        return ((C2113) mo217((InterfaceC0443) obj2, (InterfaceC0238) obj)).mo218(C2358.f7817);
    }
}
