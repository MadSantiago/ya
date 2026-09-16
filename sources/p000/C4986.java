package p000;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: renamed from: ۦؘؙۗؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4986 extends AbstractC4294 {

    /* JADX INFO: renamed from: ۥؗ */
    public final /* synthetic */ Member f16498;

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ C3751 f16499;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4986(C1039 c1039, C3751 c3751, Member member, int i) {
        super(i);
        this.f16499 = c3751;
        this.f16498 = member;
    }

    @Override // p000.AbstractC4294
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo2635(C1414 c1414) {
        Object c4535;
        int i = C0954.f3386;
        C3751 c3751 = this.f16499;
        C0954 c0954 = new C0954();
        c0954.f3387 = c1414;
        Member member = this.f16498;
        try {
            InterfaceC4745 interfaceC4745 = c3751.f12479;
            if (interfaceC4745 != null) {
                interfaceC4745.mo211(c0954);
            }
            Member member2 = (Member) ((C0514) c1414.f4871).mo449();
            Method method = member2 instanceof Method ? (Method) member2 : null;
            Class<?> returnType = method != null ? method.getReturnType() : null;
            Object objMo219 = ((C2263) c1414.f4867).mo219(null, Boolean.FALSE);
            C3751.m6587(returnType, objMo219 != null ? objMo219.getClass() : null);
            if (c3751.f12479 != null) {
                ArrayList arrayList = C2503.f8322;
                Objects.toString(member);
                C2503.m4651();
            }
            c4535 = C2358.f7817;
        } catch (Throwable th) {
            c4535 = new C4535(th);
        }
        Throwable thM405 = AbstractC0183.m405(c4535);
        if (thM405 != null) {
            InterfaceC4745 interfaceC4746 = c3751.f12483;
            if (interfaceC4746 != null) {
                interfaceC4746.mo211(thM405);
            }
            if (c3751.f12483 == null) {
                c3751.m6589(thM405, member);
            }
        }
    }

    @Override // p000.AbstractC4294
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo917(C1414 c1414) {
        Object c4535;
        int i = C0954.f3386;
        C3751 c3751 = this.f16499;
        C0954 c0954 = new C0954();
        c0954.f3387 = c1414;
        Member member = this.f16498;
        try {
            InterfaceC4745 interfaceC4745 = c3751.f12474;
            if (interfaceC4745 != null) {
                interfaceC4745.mo211(c0954);
            }
            if (c3751.f12474 != null) {
                ArrayList arrayList = C2503.f8322;
                Objects.toString(member);
                C2503.m4651();
            }
            c4535 = C2358.f7817;
        } catch (Throwable th) {
            c4535 = new C4535(th);
        }
        Throwable thM405 = AbstractC0183.m405(c4535);
        if (thM405 != null) {
            InterfaceC4745 interfaceC4746 = c3751.f12483;
            if (interfaceC4746 != null) {
                interfaceC4746.mo211(thM405);
            }
            if (c3751.f12483 == null) {
                c3751.m6589(thM405, member);
            }
        }
    }
}
