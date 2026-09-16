package p000;

import java.io.IOException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ۥۘٚٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2192 extends AbstractC4489 {

    /* JADX INFO: renamed from: ۥؔ */
    public final InterfaceC2003 f7274;

    /* JADX INFO: renamed from: ۦُ */
    public final Method f7275;

    /* JADX INFO: renamed from: ۦٖ */
    public final int f7276;

    public C2192(Method method, int i, InterfaceC2003 interfaceC2003) {
        this.f7275 = method;
        this.f7276 = i;
        this.f7274 = interfaceC2003;
    }

    @Override // p000.AbstractC4489
    /* JADX INFO: renamed from: ۦٛ */
    public final void mo963(C1781 c1781, Object obj) {
        int i = this.f7276;
        Method method = this.f7275;
        if (obj == null) {
            throw AbstractC4554.m7926(method, i, "Body parameter value must not be null.", new Object[0]);
        }
        try {
            c1781.f5946 = (AbstractC2577) this.f7274.mo804(obj);
        } catch (IOException e) {
            throw AbstractC4554.m7882(method, e, i, "Unable to convert " + obj + " to RequestBody", new Object[0]);
        }
    }
}
