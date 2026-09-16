package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

/* JADX INFO: renamed from: ۥّٕٞؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1941 extends AbstractC2329 {
    @Override // p000.AbstractC2329
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC2387 mo3798(Type type, Annotation[] annotationArr) {
        if (AbstractC4554.m7897(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            C1078.m2276("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
            return null;
        }
        Type typeM7925 = AbstractC4554.m7925(0, (ParameterizedType) type);
        if (AbstractC4554.m7897(typeM7925) != C4633.class) {
            return new C5701(0, typeM7925);
        }
        if (typeM7925 instanceof ParameterizedType) {
            return new C5701(1, AbstractC4554.m7925(0, (ParameterizedType) typeM7925));
        }
        C1078.m2276("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        return null;
    }
}
