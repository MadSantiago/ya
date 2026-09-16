package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;

/* JADX INFO: renamed from: ۥؖؖٛۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0551 extends AbstractC5084 {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f1968;

    public /* synthetic */ C0551(int i) {
        this.f1968 = i;
    }

    @Override // p000.AbstractC5084
    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC2003 mo1240(Type type, Annotation[] annotationArr, C1414 c1414) {
        switch (this.f1968) {
            case 0:
                if (type == AbstractC2978.class) {
                    return AbstractC4554.m7920(annotationArr, InterfaceC4300.class) ? C0373.f1367 : C1298.f4437;
                }
                if (type == Void.class) {
                    return C1397.f4782;
                }
                if (AbstractC4554.f15046 && type == C2358.class) {
                    return C1298.f4448;
                }
                return null;
            default:
                if (AbstractC4554.m7897(type) != Optional.class) {
                    return null;
                }
                return new C3121(10, c1414.m3005(AbstractC4554.m7925(0, (ParameterizedType) type), annotationArr));
        }
    }

    @Override // p000.AbstractC5084
    /* JADX INFO: renamed from: ۥۣ */
    public InterfaceC2003 mo1241(Type type) {
        switch (this.f1968) {
            case 0:
                if (AbstractC2577.class.isAssignableFrom(AbstractC4554.m7897(type))) {
                    return C1397.f4784;
                }
                return null;
            default:
                return super.mo1241(type);
        }
    }
}
