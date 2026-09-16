package p000;

import android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ۦۦٍؑٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5733 implements InterfaceC0238, InterfaceC2755 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C0448 f18903;

    public C5733(C0448 c0448) {
        this.f18903 = c0448;
    }

    @Override // p000.InterfaceC2755
    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC3879 mo466() {
        return this.f18903;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0090  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥُ */
    public final Object m9540(EnumC1806 enumC1806, InterfaceC5731 interfaceC5731, AbstractC0772 abstractC0772) throws Throwable {
        C3266 c3266;
        C5733 c5733;
        C0956 c0956;
        if (abstractC0772 instanceof C3266) {
            c3266 = (C3266) abstractC0772;
            int i = c3266.f10968;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3266.f10968 = i - Integer.MIN_VALUE;
            } else {
                c3266 = new C3266(this, abstractC0772);
            }
        } else {
            c3266 = new C3266(this, abstractC0772);
        }
        Object obj = c3266.f10966;
        int i2 = c3266.f10968;
        if (i2 == 0) {
            AbstractC0186.m409(obj);
            C0956 c0957 = this.f18903.f1637;
            c0957.m1987();
            int iOrdinal = enumC1806.ordinal();
            if (iOrdinal == 0) {
                SQLiteDatabase sQLiteDatabase = c0957.f3394;
                InterfaceC5130 interfaceC5130 = C0956.f3390;
                if (((Method) interfaceC5130.getValue()) != null) {
                    InterfaceC5130 interfaceC5131 = C0956.f3392;
                    if (((Method) interfaceC5131.getValue()) != null) {
                        Method method = (Method) interfaceC5130.getValue();
                        Object objInvoke = ((Method) interfaceC5131.getValue()).invoke(sQLiteDatabase, null);
                        if (objInvoke != null) {
                            method.invoke(objInvoke, 0, null, 0, null);
                        } else {
                            C1078.m2276("Required value was null.");
                        }
                    } else {
                        c0957.m1986();
                    }
                } else {
                    c0957.m1986();
                }
            } else if (iOrdinal == 1) {
                c0957.m1985();
            } else {
                if (iOrdinal != 2) {
                    C1078.m2275();
                    return null;
                }
                c0957.m1986();
            }
            try {
                Object c0202 = new C0202(1, this);
                c3266.f10965 = this;
                c3266.f10964 = c0957;
                c3266.f10968 = 1;
                Object objMo219 = interfaceC5731.mo219(c0202, c3266);
                Object obj2 = EnumC2282.f7590;
                if (objMo219 == obj2) {
                    return obj2;
                }
                c5733 = this;
                c0956 = c0957;
                obj = objMo219;
            } catch (Throwable th) {
                th = th;
                c5733 = this;
                c0956 = c0957;
                c0956.m1981();
                if (!c0956.m1987()) {
                    c5733.getClass();
                }
                throw th;
            }
        } else {
            if (i2 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c0956 = c3266.f10964;
            c5733 = c3266.f10965;
            try {
                AbstractC0186.m409(obj);
            } catch (Throwable th2) {
                th = th2;
                c0956.m1981();
                if (!c0956.m1987()) {
                    c5733.getClass();
                }
                throw th;
            }
        }
        c0956.m1983();
        c0956.m1981();
        if (!c0956.m1987()) {
            c5733.getClass();
        }
        return obj;
    }

    @Override // p000.InterfaceC1550
    /* JADX INFO: renamed from: ۥۗ */
    public final Object mo467(String str, InterfaceC4745 interfaceC4745, AbstractC0772 abstractC0772) {
        AbstractC3496 abstractC3496Mo971 = this.f18903.mo971(str);
        try {
            Object objMo211 = interfaceC4745.mo211(abstractC3496Mo971);
            AbstractC1434.m3052(abstractC3496Mo971, null);
            return objMo211;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1434.m3052(abstractC3496Mo971, th);
                throw th2;
            }
        }
    }

    @Override // p000.InterfaceC0238
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo500(EnumC1806 enumC1806, InterfaceC5731 interfaceC5731, AbstractC2426 abstractC2426) {
        return m9540(enumC1806, interfaceC5731, abstractC2426);
    }

    @Override // p000.InterfaceC0238
    /* JADX INFO: renamed from: ۦؑ */
    public final Object mo501(AbstractC2426 abstractC2426) {
        return Boolean.valueOf(this.f18903.f1637.m1987());
    }
}
