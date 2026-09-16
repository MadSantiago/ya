package p000;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: ۦًؘؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3513 {

    /* JADX INFO: renamed from: ۥؗ */
    public final Method f11629;

    /* JADX INFO: renamed from: ۥۗ */
    public final Object f11630;

    /* JADX INFO: renamed from: ۥۣ */
    public final Class f11631;

    /* JADX INFO: renamed from: ۦؑ */
    public final List f11632;

    public C3513(Class cls, Object obj, Method method, ArrayList arrayList) {
        this.f11631 = cls;
        this.f11630 = obj;
        this.f11629 = method;
        this.f11632 = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        return String.format("%s.%s() %s", this.f11631.getName(), this.f11629.getName(), this.f11632);
    }
}
