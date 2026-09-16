package p000;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: renamed from: ۦؚؒ۟ؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3585 extends AbstractC1246 {

    /* JADX INFO: renamed from: ۥؗ */
    public final /* synthetic */ C3751 f11934;

    /* JADX INFO: renamed from: ۦؑ */
    public final /* synthetic */ Member f11935;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3585(C1039 c1039, C3751 c3751, Member member, int i) {
        super(i);
        this.f11934 = c3751;
        this.f11935 = member;
    }

    @Override // p000.AbstractC1246
    /* JADX INFO: renamed from: ۥّ */
    public final Object mo2634(C1414 c1414) {
        Object c4535;
        int i = C0954.f3386;
        C3751 c3751 = this.f11934;
        C0954 c0954 = new C0954();
        c0954.f3387 = c1414;
        Member member = this.f11935;
        try {
            InterfaceC4745 interfaceC4745 = c3751.f12475;
            c4535 = interfaceC4745 != null ? interfaceC4745.mo211(c0954) : null;
            Member member2 = (Member) ((C0514) c1414.f4871).mo449();
            Method method = member2 instanceof Method ? (Method) member2 : null;
            C3751.m6587(method != null ? method.getReturnType() : null, c4535 != null ? c4535.getClass() : null);
            if (c3751.f12475 != null) {
                ArrayList arrayList = C2503.f8322;
                Objects.toString(member);
                C2503.m4651();
            }
        } catch (Throwable th) {
            c4535 = new C4535(th);
        }
        Throwable thM405 = AbstractC0183.m405(c4535);
        if (thM405 == null) {
            return c4535;
        }
        InterfaceC4745 interfaceC4746 = c3751.f12483;
        if (interfaceC4746 != null) {
            interfaceC4746.mo211(thM405);
        }
        if (c3751.f12483 == null) {
            c3751.m6589(thM405, member);
        }
        return c0954.m1972();
    }
}
