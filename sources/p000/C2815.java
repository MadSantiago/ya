package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: ۥۦُؖٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2815 extends AbstractC5084 {

    /* JADX INFO: renamed from: ۥۗ */
    public final C1039 f9396;

    /* JADX INFO: renamed from: ۥۣ */
    public final C0822 f9397;

    public C2815(C0822 c0822, C1039 c1039) {
        this.f9397 = c0822;
        this.f9396 = c1039;
    }

    @Override // p000.AbstractC5084
    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC2003 mo1240(Type type, Annotation[] annotationArr, C1414 c1414) {
        return new C5002(22, AbstractC2133.m4143(type), this.f9396, false);
    }

    @Override // p000.AbstractC5084
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC2003 mo1241(Type type) {
        return new C2808(this.f9397, AbstractC2133.m4143(type), this.f9396, 29);
    }
}
