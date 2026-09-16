package p000;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ۦٟٟؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4881 extends AbstractC2426 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥؓ */
    public final /* synthetic */ C1489 f16049;

    /* JADX INFO: renamed from: ۥؖ */
    public final /* synthetic */ C4482 f16050;

    /* JADX INFO: renamed from: ۥَ */
    public Object f16051;

    /* JADX INFO: renamed from: ۥٖ */
    public Serializable f16052;

    /* JADX INFO: renamed from: ۥٙ */
    public int f16053;

    /* JADX INFO: renamed from: ۥۖ */
    public Iterator f16054;

    /* JADX INFO: renamed from: ۦٕ */
    public int f16055;

    /* JADX INFO: renamed from: ۦٗ */
    public Object f16056;

    /* JADX INFO: renamed from: ۦۛ */
    public Object f16057;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4881(C4482 c4482, C1489 c1489, InterfaceC0443 interfaceC0443) {
        super(1, interfaceC0443);
        this.f16050 = c4482;
        this.f16049 = c1489;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[LOOP:0: B:21:0x009f->B:51:?, LOOP_END, SYNTHETIC] */
    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        InterfaceC3087 c1387;
        C5662 c5662;
        C5450 c5450;
        C5450 c5451;
        InterfaceC3087 interfaceC3087;
        Iterator it;
        InterfaceC3087 interfaceC3088;
        C5662 c5663;
        C5450 c5452;
        C1058 c1058;
        C5450 c5453;
        C5662 c5664;
        InterfaceC5731 interfaceC5731;
        Object obj2;
        int iHashCode;
        Object objMo5825;
        Object obj3;
        int i = this.f16053;
        C1489 c1489 = this.f16049;
        C4482 c4482 = this.f16050;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        if (i == 0) {
            AbstractC0186.m409(obj);
            c1387 = new C1387();
            c5662 = new C5662();
            c5450 = new C5450();
            this.f16051 = c1387;
            this.f16052 = c5662;
            this.f16056 = c5450;
            this.f16057 = c5450;
            this.f16053 = 1;
            obj = c4482.m7763(true, this);
            if (obj != enumC2282) {
                c5451 = c5450;
            }
            return enumC2282;
        }
        if (i == 1) {
            c5450 = (C5450) this.f16057;
            c5451 = (C5450) this.f16056;
            c5662 = (C5662) this.f16052;
            c1387 = (InterfaceC3087) this.f16051;
            AbstractC0186.m409(obj);
        } else {
            if (i == 2) {
                it = this.f16054;
                c1058 = (C1058) this.f16057;
                c5452 = (C5450) this.f16056;
                c5663 = (C5662) this.f16052;
                interfaceC3088 = (InterfaceC3087) this.f16051;
                AbstractC0186.m409(obj);
                while (it.hasNext()) {
                    interfaceC5731 = (InterfaceC5731) it.next();
                    this.f16051 = interfaceC3088;
                    this.f16052 = c5663;
                    this.f16056 = c5452;
                    this.f16057 = c1058;
                    this.f16054 = it;
                    this.f16053 = 2;
                    if (interfaceC5731.mo219(c1058, this) == enumC2282) {
                        return enumC2282;
                    }
                }
                c5451 = c5452;
                c5662 = c5663;
                interfaceC3087 = interfaceC3088;
                c1489.f5058 = null;
                this.f16051 = c5662;
                this.f16052 = c5451;
                this.f16056 = interfaceC3087;
                this.f16057 = null;
                this.f16054 = null;
                this.f16053 = 3;
                if (interfaceC3087.mo2949(this) != enumC2282) {
                    c5453 = c5451;
                    c5664 = c5662;
                    c5664.f18631 = true;
                    interfaceC3087.mo2950(null);
                    obj2 = c5453.f17965;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    InterfaceC5823 interfaceC5823M7761 = c4482.m7761();
                    this.f16051 = obj2;
                    this.f16052 = null;
                    this.f16056 = null;
                    this.f16055 = iHashCode;
                    this.f16053 = 4;
                    objMo5825 = interfaceC5823M7761.mo5825(this);
                    if (objMo5825 != enumC2282) {
                        obj = objMo5825;
                        obj3 = obj2;
                    }
                }
                return enumC2282;
            }
            if (i == 3) {
                interfaceC3087 = (InterfaceC3087) this.f16056;
                c5453 = (C5450) this.f16052;
                c5664 = (C5662) this.f16051;
                AbstractC0186.m409(obj);
                try {
                    c5664.f18631 = true;
                    interfaceC3087.mo2950(null);
                    obj2 = c5453.f17965;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    InterfaceC5823 interfaceC5823M7762 = c4482.m7761();
                    this.f16051 = obj2;
                    this.f16052 = null;
                    this.f16056 = null;
                    this.f16055 = iHashCode;
                    this.f16053 = 4;
                    objMo5825 = interfaceC5823M7762.mo5825(this);
                    if (objMo5825 != enumC2282) {
                        obj = objMo5825;
                        obj3 = obj2;
                    }
                    return enumC2282;
                } catch (Throwable th) {
                    interfaceC3087.mo2950(null);
                    throw th;
                }
            }
            if (i != 4) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            iHashCode = this.f16055;
            obj3 = this.f16051;
            AbstractC0186.m409(obj);
        }
        return new C4127(iHashCode, ((Number) obj).intValue(), obj3);
        c5450.f17965 = ((C4127) obj).f13747;
        C1058 c1059 = new C1058(c1387, c5662, c5451, c4482);
        List list = (List) c1489.f5058;
        if (list != null) {
            it = list.iterator();
            interfaceC3088 = c1387;
            c5663 = c5662;
            c5452 = c5451;
            c1058 = c1059;
            while (it.hasNext()) {
                interfaceC5731 = (InterfaceC5731) it.next();
                this.f16051 = interfaceC3088;
                this.f16052 = c5663;
                this.f16056 = c5452;
                this.f16057 = c1058;
                this.f16054 = it;
                this.f16053 = 2;
                if (interfaceC5731.mo219(c1058, this) == enumC2282) {
                    return enumC2282;
                }
            }
            c5451 = c5452;
            c5662 = c5663;
            interfaceC3087 = interfaceC3088;
        } else {
            interfaceC3087 = c1387;
        }
        c1489.f5058 = null;
        this.f16051 = c5662;
        this.f16052 = c5451;
        this.f16056 = interfaceC3087;
        this.f16057 = null;
        this.f16054 = null;
        this.f16053 = 3;
        if (interfaceC3087.mo2949(this) != enumC2282) {
            c5453 = c5451;
            c5664 = c5662;
            c5664.f18631 = true;
            interfaceC3087.mo2950(null);
            obj2 = c5453.f17965;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            InterfaceC5823 interfaceC5823M7763 = c4482.m7761();
            this.f16051 = obj2;
            this.f16052 = null;
            this.f16056 = null;
            this.f16055 = iHashCode;
            this.f16053 = 4;
            objMo5825 = interfaceC5823M7763.mo5825(this);
            if (objMo5825 != enumC2282) {
                obj = objMo5825;
                obj3 = obj2;
                return new C4127(iHashCode, ((Number) obj).intValue(), obj3);
            }
        }
        return enumC2282;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        return new C4881(this.f16050, this.f16049, (InterfaceC0443) obj).mo218(C2358.f7817);
    }
}
