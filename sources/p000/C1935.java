package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ۥٞؒۨۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1935 extends AbstractC2329 {

    /* JADX INFO: renamed from: ۥۣ */
    public final Executor f6397;

    public C1935(Executor executor) {
        this.f6397 = executor;
    }

    @Override // p000.AbstractC2329
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC2387 mo3798(Type type, Annotation[] annotationArr) {
        if (AbstractC4554.m7897(type) != InterfaceC5065.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new C5002(20, AbstractC4554.m7925(0, (ParameterizedType) type), AbstractC4554.m7920(annotationArr, InterfaceC3217.class) ? null : this.f6397, false);
        }
        C1078.m2272("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        return null;
    }
}
