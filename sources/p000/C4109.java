package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: ۦٓؒٓۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4109 extends AbstractC5224 {

    /* JADX INFO: renamed from: ۥؗ */
    public final AbstractC2265 f13700;

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ int f13701;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4109(InterfaceC4734 interfaceC4734, int i) {
        super(interfaceC4734);
        this.f13701 = i;
        switch (i) {
            case 1:
                super(interfaceC4734);
                this.f13700 = new C4362(interfaceC4734.mo193(), 2);
                break;
            default:
                this.f13700 = new C4362(interfaceC4734.mo193(), 1);
                break;
        }
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC0103 mo193() {
        int i = this.f13701;
        AbstractC2265 abstractC2265 = this.f13700;
        switch (i) {
            case 0:
                break;
        }
        return (C4362) abstractC2265;
    }

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۥُ */
    public final Object mo194() {
        switch (this.f13701) {
            case 0:
                return new ArrayList();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۥّ */
    public final int mo195(Object obj) {
        switch (this.f13701) {
            case 0:
                return ((ArrayList) obj).size();
            default:
                return ((LinkedHashSet) obj).size();
        }
    }

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۥۜ */
    public final int mo539(Object obj) {
        return ((Collection) obj).size();
    }

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo198(Object obj) {
        switch (this.f13701) {
            case 0:
                return (ArrayList) obj;
            default:
                return (LinkedHashSet) obj;
        }
    }

    @Override // p000.AbstractC5224
    /* JADX INFO: renamed from: ۦٌ */
    public final void mo199(int i, Object obj, Object obj2) {
        switch (this.f13701) {
            case 0:
                ((ArrayList) obj).add(i, obj2);
                break;
            default:
                ((LinkedHashSet) obj).add(obj2);
                break;
        }
    }

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۦۗ */
    public final Object mo541(Object obj) {
        switch (this.f13701) {
            case 0:
                throw null;
            default:
                throw null;
        }
    }

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۦۙ */
    public final Iterator mo200(Object obj) {
        return ((Collection) obj).iterator();
    }
}
