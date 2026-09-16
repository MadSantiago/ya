package p000;

import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: renamed from: ۥًؘؚۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0804 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥؗ */
    public final PointerInputEventHandler f2871;

    /* JADX INFO: renamed from: ۥۗ */
    public final Object f2872;

    /* JADX INFO: renamed from: ۥۣ */
    public final Object f2873;

    public C0804(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler, int i) {
        obj2 = (i & 2) != 0 ? null : obj2;
        this.f2873 = obj;
        this.f2872 = obj2;
        this.f2871 = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0804)) {
            return false;
        }
        C0804 c0804 = (C0804) obj;
        return AbstractC3831.m6874(this.f2873, c0804.f2873) && AbstractC3831.m6874(this.f2872, c0804.f2872) && this.f2871 == c0804.f2871;
    }

    public final int hashCode() {
        Object obj = this.f2873;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f2872;
        return this.f2871.hashCode() + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 961);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C2439 c2439 = (C2439) abstractC5381;
        Object obj = c2439.f8114;
        Object obj2 = this.f2873;
        boolean z = !AbstractC3831.m6874(obj, obj2);
        c2439.f8114 = obj2;
        Object obj3 = c2439.f8123;
        Object obj4 = this.f2872;
        if (!AbstractC3831.m6874(obj3, obj4)) {
            z = true;
        }
        c2439.f8123 = obj4;
        Class<?> cls = c2439.f8115.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.f2871;
        if (cls == pointerInputEventHandler.getClass() ? z : true) {
            c2439.m4553();
        }
        c2439.f8115 = pointerInputEventHandler;
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        return new C2439(this.f2873, this.f2872, this.f2871);
    }
}
