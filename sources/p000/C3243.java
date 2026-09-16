package p000;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: ۦؔٔۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3243 extends AbstractC4294 {

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ int f10886;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3243(int i, int i2) {
        super(i);
        this.f10886 = i2;
    }

    @Override // p000.AbstractC4294
    /* JADX INFO: renamed from: ۥۗ */
    public void mo2635(C1414 c1414) {
        Object c4535;
        switch (this.f10886) {
            case 1:
                try {
                    Iterator it = C1967.f6502.entrySet().iterator();
                    while (it.hasNext()) {
                        if (((Map.Entry) it.next()).getValue() != null) {
                            throw new ClassCastException();
                        }
                        Object[] objArrM3003 = c1414.m3003();
                        Object obj = objArrM3003 != null ? objArrM3003[0] : null;
                        if ((obj instanceof Context ? (Context) obj : null) != null) {
                            throw null;
                        }
                    }
                    c4535 = C2358.f7817;
                } catch (Throwable th) {
                    c4535 = new C4535(th);
                }
                Throwable thM405 = AbstractC0183.m405(c4535);
                if (thM405 != null) {
                    c1414.m2985(thM405);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // p000.AbstractC4294
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo917(C1414 c1414) {
        int i = this.f10886;
        Object c4535 = C2358.f7817;
        switch (i) {
            case 0:
                try {
                    Object obj = ((C0514) c1414.f4868).f1837.thisObject;
                    if ((obj instanceof Application ? (Application) obj : null) == null) {
                        return;
                    }
                    Object[] objArrM3003 = c1414.m3003();
                    Object obj2 = objArrM3003 != null ? objArrM3003[0] : null;
                    if ((obj2 instanceof Configuration ? (Configuration) obj2 : null) == null) {
                        return;
                    }
                    Iterator it = C1967.f6502.entrySet().iterator();
                    if (it.hasNext()) {
                        if (((Map.Entry) it.next()).getValue() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                    Throwable thM405 = AbstractC0183.m405(c4535);
                    if (thM405 != null) {
                        c1414.m2985(thM405);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    c4535 = new C4535(th);
                }
                break;
            case 1:
                try {
                    Iterator it2 = C1967.f6502.entrySet().iterator();
                    while (it2.hasNext()) {
                        if (((Map.Entry) it2.next()).getValue() != null) {
                            throw new ClassCastException();
                        }
                        Object[] objArrM3004 = c1414.m3003();
                        Object obj3 = objArrM3004 != null ? objArrM3004[0] : null;
                        if ((obj3 instanceof Context ? (Context) obj3 : null) != null) {
                            throw null;
                        }
                    }
                } catch (Throwable th2) {
                    c4535 = new C4535(th2);
                }
                Throwable thM406 = AbstractC0183.m405(c4535);
                if (thM406 != null) {
                    c1414.m2985(thM406);
                    return;
                }
                return;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                try {
                    Iterator it3 = C1967.f6502.entrySet().iterator();
                    while (it3.hasNext()) {
                        if (((Map.Entry) it3.next()).getValue() != null) {
                            throw new ClassCastException();
                        }
                        Object obj4 = ((C0514) c1414.f4868).f1837.thisObject;
                        if ((obj4 instanceof Application ? (Application) obj4 : null) != null) {
                            throw null;
                        }
                    }
                } catch (Throwable th3) {
                    c4535 = new C4535(th3);
                }
                Throwable thM407 = AbstractC0183.m405(c4535);
                if (thM407 != null) {
                    c1414.m2985(thM407);
                    return;
                }
                return;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                try {
                    Iterator it4 = C1967.f6502.entrySet().iterator();
                    while (it4.hasNext()) {
                        if (((Map.Entry) it4.next()).getValue() != null) {
                            throw new ClassCastException();
                        }
                        Object obj5 = ((C0514) c1414.f4868).f1837.thisObject;
                        if ((obj5 instanceof Application ? (Application) obj5 : null) != null) {
                            throw null;
                        }
                    }
                } catch (Throwable th4) {
                    c4535 = new C4535(th4);
                }
                Throwable thM408 = AbstractC0183.m405(c4535);
                if (thM408 != null) {
                    c1414.m2985(thM408);
                    return;
                }
                return;
            default:
                try {
                    Object obj6 = ((C0514) c1414.f4868).f1837.thisObject;
                    if ((obj6 instanceof Application ? (Application) obj6 : null) == null) {
                        return;
                    }
                    Object[] objArrM3005 = c1414.m3003();
                    Object obj7 = objArrM3005 != null ? objArrM3005[0] : null;
                    if ((obj7 instanceof Integer ? (Integer) obj7 : null) != null) {
                        Iterator it5 = C1967.f6502.entrySet().iterator();
                        if (it5.hasNext()) {
                            if (((Map.Entry) it5.next()).getValue() != null) {
                                throw new ClassCastException();
                            }
                            throw null;
                        }
                        Throwable thM409 = AbstractC0183.m405(c4535);
                        if (thM409 != null) {
                            c1414.m2985(thM409);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th5) {
                    c4535 = new C4535(th5);
                }
                break;
        }
    }
}
