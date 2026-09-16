package p000;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: ۦٌٕٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3751 {

    /* JADX INFO: renamed from: ۥؗ */
    public boolean f12473;

    /* JADX INFO: renamed from: ۥُ */
    public InterfaceC4745 f12474;

    /* JADX INFO: renamed from: ۥّ */
    public InterfaceC4745 f12475;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f12476;

    /* JADX INFO: renamed from: ۥۜ */
    public boolean f12477;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f12478;

    /* JADX INFO: renamed from: ۦؑ */
    public InterfaceC4745 f12479;

    /* JADX INFO: renamed from: ۦِ */
    public final LinkedHashSet f12480;

    /* JADX INFO: renamed from: ۦٛ */
    public final LinkedHashSet f12481;

    /* JADX INFO: renamed from: ۦۗ */
    public final /* synthetic */ C1039 f12482;

    /* JADX INFO: renamed from: ۦۙ */
    public InterfaceC4745 f12483;

    public C3751(C1039 c1039, int i, int i2) {
        this.f12482 = c1039;
        this.f12478 = i;
        this.f12476 = i2;
        C1298.m2758();
        C1298.m2758();
        C1298.m2758();
        this.f12481 = new LinkedHashSet();
        this.f12480 = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static void m6587(Class cls, Class cls2) {
        if (cls == null || cls2 == null) {
            return;
        }
        Class<Object> clsM9037 = AbstractC5378.m9037(AbstractC5041.m8557(Object.class));
        if (cls.equals(clsM9037 != null ? clsM9037 : Object.class)) {
            return;
        }
        Class clsM6775 = AbstractC3801.m6775(cls);
        Class<?> clsM6776 = AbstractC3801.m6775(cls2);
        ConcurrentHashMap concurrentHashMap = AbstractC2405.f8013;
        if (clsM6776.isAssignableFrom(clsM6775) || clsM6775.isAssignableFrom(clsM6776)) {
            return;
        }
        throw new IllegalStateException(("Hooked method return type match failed, required [" + cls + "] but got [" + cls2 + "]").toString());
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[priority] ");
        int i = this.f12478;
        if (i == 1) {
            str = "DEFAULT";
        } else if (i != 2) {
            str = i != 3 ? "null" : "HIGHEST";
        } else {
            str = "LOWEST";
        }
        sb.append(str);
        sb.append(" [members] ");
        sb.append(this.f12480);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final C2391 m6588() {
        C2391 c2391 = new C2391(2, this);
        m6590(true);
        return c2391;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m6589(Throwable th, Member member) {
        String str;
        ArrayList arrayList = C2503.f8322;
        if (member != null) {
            str = "[" + member + "]";
        } else {
            str = "nothing";
        }
        C2503.m4657(4, "Try to hook " + str + " got an exception", th);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0037  */
    /* JADX INFO: renamed from: ۥّ */
    public final void m6590(boolean z) {
        Object c4535;
        boolean zBooleanValue;
        Object c4536;
        int i = this.f12476;
        if ((z && i == 2) || i == 3) {
            int i2 = AbstractC2776.f9251[0];
            if (AbstractC1630.f5457[AbstractC3761.m6632(i2)] == 1) {
                try {
                    XposedBridge.getXposedVersion();
                    c4535 = Boolean.TRUE;
                } catch (Throwable th) {
                    c4535 = new C4535(th);
                }
                if (c4535 instanceof C4535) {
                    c4535 = null;
                }
                Boolean bool = (Boolean) c4535;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
            } else {
                zBooleanValue = false;
            }
            if (!zBooleanValue) {
                i2 = 2;
            }
            if (i2 != 2) {
                C1039 c1039 = this.f12482;
                C2319 c2319 = ((C4047) c1039.f3672).f13492;
                if ((c2319 != null ? c2319.f7671 : 0) == 3 || this.f12473) {
                    return;
                }
                this.f12473 = true;
                LinkedHashSet<Member> linkedHashSet = this.f12480;
                if (linkedHashSet.isEmpty()) {
                    linkedHashSet = null;
                }
                if (linkedHashSet == null) {
                    Throwable th2 = new Throwable("Finding Error isSetUpMember [false]");
                    InterfaceC4745 interfaceC4745 = this.f12483;
                    if (interfaceC4745 != null) {
                        interfaceC4745.mo211(th2);
                    }
                    if (i == 1 && this.f12483 == null) {
                        ArrayList arrayList = C2503.f8322;
                        C2503.m4657(4, "Hooked Member cannot be null", th2);
                        return;
                    }
                    return;
                }
                for (Member member : linkedHashSet) {
                    try {
                        int i3 = this.f12478;
                        AbstractC4294 c3585 = new C3585(c1039, this, member, i3);
                        C4986 c4986 = new C4986(c1039, this, member, i3);
                        if (!this.f12477) {
                            c3585 = c4986;
                        }
                        C5606 c5606M8637 = C5063.m8637(member, c3585);
                        C1039 c10310 = c5606M8637.f18462;
                        if ((c10310 != null ? ((XC_MethodHook.Unhook) ((C0101) c10310.f3672).f19306).getHookedMethod() : null) == null) {
                            throw new IllegalStateException(("Hook Member [" + member + "] failed").toString());
                        }
                        this.f12481.add(c5606M8637.f18462);
                        c4536 = c5606M8637;
                    } catch (Throwable th3) {
                        c4536 = new C4535(th3);
                    }
                    Throwable thM405 = AbstractC0183.m405(c4536);
                    if (thM405 != null) {
                        InterfaceC4745 interfaceC4746 = this.f12483;
                        if (interfaceC4746 != null) {
                            interfaceC4746.mo211(thM405);
                        }
                        if (this.f12483 == null) {
                            m6589(thM405, member);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m6591(InterfaceC4745 interfaceC4745) {
        this.f12477 = false;
        this.f12479 = interfaceC4745;
        m6590(false);
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final void m6592(Object obj) {
        this.f12477 = true;
        this.f12475 = new C4884(24, obj);
        m6590(false);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m6593(InterfaceC4745 interfaceC4745) {
        this.f12477 = false;
        this.f12474 = interfaceC4745;
        m6590(false);
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final void m6594() {
        this.f12477 = true;
        this.f12475 = new C1202(1);
        m6590(false);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m6595() {
        this.f12477 = true;
        this.f12475 = new C1202(2);
        m6590(false);
    }
}
