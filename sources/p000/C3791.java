package p000;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: renamed from: ۦٍؕٙؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3791 extends AbstractC4489 {

    /* JADX INFO: renamed from: ۥؔ */
    public final int f12587;

    /* JADX INFO: renamed from: ۦُ */
    public final /* synthetic */ int f12588 = 1;

    /* JADX INFO: renamed from: ۦٖ */
    public final Method f12589;

    /* JADX INFO: renamed from: ۦۜ */
    public final InterfaceC2003 f12590;

    /* JADX INFO: renamed from: ۦۣ */
    public final Object f12591;

    public C3791(Method method, int i, InterfaceC2003 interfaceC2003, String str) {
        this.f12589 = method;
        this.f12587 = i;
        this.f12590 = interfaceC2003;
        this.f12591 = str;
    }

    @Override // p000.AbstractC4489
    /* JADX INFO: renamed from: ۦٛ */
    public final void mo963(C1781 c1781, Object obj) {
        int i = this.f12588;
        InterfaceC2003 interfaceC2003 = this.f12590;
        Object obj2 = this.f12591;
        Method method = this.f12589;
        int i2 = this.f12587;
        switch (i) {
            case 0:
                if (obj == null) {
                    return;
                }
                try {
                    c1781.m3565((C4714) obj2, (AbstractC2577) interfaceC2003.mo804(obj));
                    return;
                } catch (IOException e) {
                    throw AbstractC4554.m7926(method, i2, "Unable to convert " + obj + " to RequestBody", e);
                }
            default:
                Map map = (Map) obj;
                if (map == null) {
                    throw AbstractC4554.m7926(method, i2, "Part map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw AbstractC4554.m7926(method, i2, "Part map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw AbstractC4554.m7926(method, i2, AbstractC3761.m6629("Part map contained null value for key '", str, "'."), new Object[0]);
                    }
                    c1781.m3565(AbstractC4225.m7469("Content-Disposition", AbstractC3761.m6629("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) obj2), (AbstractC2577) interfaceC2003.mo804(value));
                }
                return;
        }
    }

    public C3791(Method method, int i, C4714 c4714, InterfaceC2003 interfaceC2003) {
        this.f12589 = method;
        this.f12587 = i;
        this.f12591 = c4714;
        this.f12590 = interfaceC2003;
    }
}
