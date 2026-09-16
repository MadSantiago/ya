package p000;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: ۦُّؖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C4047 {

    /* JADX INFO: renamed from: ۥۣ */
    public C2319 f13492 = null;

    /* JADX INFO: renamed from: ۥّ */
    public static Class m7247(AbstractC1985 abstractC1985, String str) {
        Object c4535;
        try {
            c4535 = AbstractC2405.m4530(abstractC1985.m7250(), str);
        } catch (Throwable th) {
            c4535 = new C4535(th);
        }
        if (c4535 instanceof C4535) {
            c4535 = null;
        }
        return (Class) c4535;
    }

    public final String toString() {
        return "PackageParam(" + super.toString() + ") by " + this.f13492;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final C1489 m7248() {
        String strM3847;
        C2319 c2319 = this.f13492;
        if ((c2319 != null ? c2319.f7671 : 0) == 1) {
            C1078.m2276("YukiHookDataChannel cannot used in zygote");
            return null;
        }
        C2993 c2993 = C2993.f10066;
        if (c2993 == null) {
            c2993 = new C2993();
            C2993.f10066 = c2993;
        }
        C2319 c23110 = this.f13492;
        if (c23110 != null) {
            strM3847 = c23110.f7670;
        } else {
            C1967.f6501.getClass();
            strM3847 = C1967.m3847();
        }
        return c2993.m5587(null, strM3847);
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m7249(AbstractC3003 abstractC3003) {
        C2319 c2319 = abstractC3003.f13492;
        if (c2319 == null) {
            abstractC3003.m5599(this);
            return;
        }
        if (AbstractC0684.m1534(c2319.f7670) || c2319.f7671 == 1) {
            abstractC3003.m5599(this);
            return;
        }
        String str = c2319.f7670;
        C2319 c23110 = this.f13492;
        if (str.equals(c23110 != null ? c23110.f7670 : null)) {
            abstractC3003.m5599(this);
            return;
        }
        ArrayList arrayList = C2503.f8322;
        String name = abstractC3003.getClass().getName();
        C2319 c23111 = this.f13492;
        C2503.m4652("This Hooker \"" + name + "\" is singleton or reused, but the current process has multiple package name \"" + (c23111 != null ? c23111.f7670 : null) + "\", the original is \"" + c2319.f7670 + "\"\nMake sure your Hooker supports multiple instances for this situation\nThe process with package name \"" + (c23111 != null ? c23111.f7670 : null) + "\" will be ignored");
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final ClassLoader m7250() {
        C2319 c2319 = this.f13492;
        ClassLoader classLoader = c2319 != null ? c2319.f7672 : null;
        if (classLoader != null) {
            return classLoader;
        }
        C1967.f6501.getClass();
        Application applicationM3850 = C1967.m3850();
        if (applicationM3850 != null) {
            return applicationM3850.getClassLoader();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C3751 m7251(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Member member = (Member) it.next();
            if (!(member instanceof Constructor) && !(member instanceof Method)) {
                C1078.m2270(member, "] not support to hook, supported are Constructors and Methods", "This type [");
                return null;
            }
        }
        Throwable th = new Throwable("There is no hook class instance");
        C4228 c4228 = new C4228(28, false);
        c4228.f14025 = th;
        C3751 c3751 = new C3751(new C1039(this, c4228), 1, 2);
        if (!list.isEmpty()) {
            LinkedHashSet linkedHashSet = c3751.f12480;
            linkedHashSet.clear();
            linkedHashSet.addAll(list);
        }
        return c3751;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final C3751 m7252(C3657 c3657, int i) {
        if (c3657 == null) {
            C1078.m2270(c3657, "] not support to hook, supported are Constructors and Methods", "This type [");
            return null;
        }
        List listSingletonList = Collections.singletonList(c3657.f12248);
        Throwable th = new Throwable("There is no hook class instance");
        C4228 c4228 = new C4228(28, false);
        c4228.f14025 = th;
        C3751 c3751 = new C3751(new C1039(this, c4228), i, 3);
        if (!listSingletonList.isEmpty()) {
            LinkedHashSet linkedHashSet = c3751.f12480;
            linkedHashSet.clear();
            linkedHashSet.addAll(listSingletonList);
        }
        return c3751;
    }
}
