package p000;

import android.database.SQLException;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: ۥٟۘؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2194 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f7279;

    /* JADX INFO: renamed from: ۥٖ */
    public int f7280;

    /* JADX INFO: renamed from: ۦٗ */
    public /* synthetic */ Object f7281;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ C3757 f7282;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2194(C3757 c3757, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f7279 = i;
        this.f7282 = c3757;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f7279;
        C3757 c3757 = this.f7282;
        switch (i) {
            case 0:
                C2194 c2194 = new C2194(c3757, interfaceC0443, 0);
                c2194.f7281 = obj;
                return c2194;
            case 1:
                C2194 c2195 = new C2194(c3757, interfaceC0443, 1);
                c2195.f7281 = obj;
                return c2195;
            default:
                C2194 c2196 = new C2194(c3757, interfaceC0443, 2);
                c2196.f7281 = obj;
                return c2196;
        }
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        InterfaceC0238 interfaceC0238;
        Object objMo501;
        Object objMo500;
        InterfaceC0238 interfaceC0239;
        Object objMo502;
        EnumC2522[] enumC2522Arr;
        EnumC2522 enumC2522;
        int i = this.f7279;
        EnumC1806 enumC1806 = EnumC1806.f6012;
        boolean z = false;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        boolean z2 = true;
        C3757 c3757 = this.f7282;
        InterfaceC0443 interfaceC0443 = null;
        switch (i) {
            case 0:
                int i2 = this.f7280;
                if (i2 != 0) {
                    if (i2 == 1) {
                        AbstractC0186.m409(obj);
                        return obj;
                    }
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC0186.m409(obj);
                C0202 c0202 = (C0202) this.f7281;
                this.f7280 = 1;
                Object objM6611 = c3757.m6611(c0202, this);
                return objM6611 == enumC2282 ? enumC2282 : objM6611;
            case 1:
                int i3 = this.f7280;
                try {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            interfaceC0238 = (InterfaceC0238) this.f7281;
                            AbstractC0186.m409(obj);
                            objMo501 = obj;
                        } else {
                            if (i3 != 2) {
                                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            AbstractC0186.m409(obj);
                            objMo500 = obj;
                        }
                        return (Set) objMo500;
                    }
                    AbstractC0186.m409(obj);
                    interfaceC0238 = (InterfaceC0238) this.f7281;
                    this.f7281 = interfaceC0238;
                    this.f7280 = 1;
                    objMo501 = interfaceC0238.mo501(this);
                    if (objMo501 == enumC2282) {
                        return enumC2282;
                    }
                    if (!((Boolean) objMo501).booleanValue()) {
                        C2194 c2194 = new C2194(c3757, interfaceC0443, 0);
                        this.f7281 = null;
                        this.f7280 = 2;
                        objMo500 = interfaceC0238.mo500(enumC1806, c2194, this);
                        if (objMo500 == enumC2282) {
                            return enumC2282;
                        }
                        return (Set) objMo500;
                    }
                } catch (SQLException unused) {
                }
                return C1590.f5346;
            default:
                int i4 = this.f7280;
                C2358 c2358 = C2358.f7817;
                if (i4 != 0) {
                    if (i4 == 1) {
                        interfaceC0239 = (InterfaceC0238) this.f7281;
                        AbstractC0186.m409(obj);
                        objMo502 = obj;
                    } else {
                        if (i4 != 2) {
                            C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC0186.m409(obj);
                    }
                    return c2358;
                }
                AbstractC0186.m409(obj);
                interfaceC0239 = (InterfaceC0238) this.f7281;
                this.f7281 = interfaceC0239;
                this.f7280 = 1;
                objMo502 = interfaceC0239.mo501(this);
                if (objMo502 == enumC2282) {
                    return enumC2282;
                }
                if (!((Boolean) objMo502).booleanValue()) {
                    C1405 c1405 = c3757.f12512;
                    long[] jArr = (long[]) c1405.f4838;
                    ReentrantLock reentrantLock = (ReentrantLock) c1405.f4836;
                    reentrantLock.lock();
                    try {
                        if (c1405.f4837) {
                            c1405.f4837 = false;
                            int length = jArr.length;
                            enumC2522Arr = new EnumC2522[length];
                            int i5 = 0;
                            boolean z3 = false;
                            while (i5 < length) {
                                if (jArr[i5] > 0) {
                                    z = z2;
                                }
                                boolean[] zArr = (boolean[]) c1405.f4835;
                                if (z != zArr[i5]) {
                                    zArr[i5] = z;
                                    enumC2522 = z ? EnumC2522.f8358 : EnumC2522.f8356;
                                    z3 = true;
                                } else {
                                    enumC2522 = EnumC2522.f8359;
                                }
                                enumC2522Arr[i5] = enumC2522;
                                i5++;
                                z = false;
                                z2 = true;
                            }
                            if (!z3) {
                                enumC2522Arr = null;
                            }
                            reentrantLock.unlock();
                        } else {
                            reentrantLock.unlock();
                            enumC2522Arr = null;
                        }
                        if (enumC2522Arr != null) {
                            C1144 c1144 = new C1144(enumC2522Arr, c3757, interfaceC0239, null);
                            this.f7281 = null;
                            this.f7280 = 2;
                            if (interfaceC0239.mo500(enumC1806, c1144, this) == enumC2282) {
                                return enumC2282;
                            }
                        }
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                return c2358;
        }
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f7279;
        C2358 c2358 = C2358.f7817;
        switch (i) {
            case 0:
                return ((C2194) mo217((InterfaceC0443) obj2, (C0202) obj)).mo218(c2358);
            case 1:
                return ((C2194) mo217((InterfaceC0443) obj2, (InterfaceC0238) obj)).mo218(c2358);
            default:
                return ((C2194) mo217((InterfaceC0443) obj2, (InterfaceC0238) obj)).mo218(c2358);
        }
    }
}
