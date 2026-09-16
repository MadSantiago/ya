package p000;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;

/* JADX INFO: renamed from: ۦٟؔ٘ؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4855 extends AbstractC2535 {

    /* JADX INFO: renamed from: ۥ٘ */
    public final C3323 f15974;

    /* JADX INFO: renamed from: ۥٛ */
    public InterfaceC0468 f15975;

    /* JADX INFO: renamed from: ۥٝ */
    public InterfaceC4745 f15976;

    /* JADX INFO: renamed from: ۥۤ */
    public InterfaceC4745 f15977;

    /* JADX INFO: renamed from: ۦؒ */
    public InterfaceC4745 f15978;

    /* JADX INFO: renamed from: ۦۣ */
    public final View f15979;

    public C4855(Context context, InterfaceC4745 interfaceC4745, AbstractC2109 abstractC2109, InterfaceC0814 interfaceC0814, int i, InterfaceC2043 interfaceC2043) {
        View view = (View) interfaceC4745.mo211(context);
        C3323 c3323 = new C3323();
        super(context, abstractC2109, i, c3323, view, interfaceC2043);
        this.f15979 = view;
        this.f15974 = c3323;
        setClipChildren(false);
        String strValueOf = String.valueOf(i);
        Object objMo1713 = interfaceC0814 != null ? interfaceC0814.mo1713(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objMo1713 instanceof SparseArray ? (SparseArray) objMo1713 : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (interfaceC0814 != null) {
            setSavableRegistryEntry(interfaceC0814.mo1714(strValueOf, new C0737(this, 2)));
        }
        C1931 c1931 = C1931.f6360;
        this.f15977 = c1931;
        this.f15978 = c1931;
        this.f15976 = c1931;
    }

    private final void setSavableRegistryEntry(InterfaceC0468 interfaceC0468) {
        InterfaceC0468 interfaceC0469 = this.f15975;
        if (interfaceC0469 != null) {
            ((C2808) interfaceC0469).m5350();
        }
        this.f15975 = interfaceC0468;
    }

    public final C3323 getDispatcher() {
        return this.f15974;
    }

    public final InterfaceC4745 getReleaseBlock() {
        return this.f15976;
    }

    public final InterfaceC4745 getResetBlock() {
        return this.f15978;
    }

    public /* bridge */ /* synthetic */ AbstractC0054 getSubCompositionView() {
        return null;
    }

    public final InterfaceC4745 getUpdateBlock() {
        return this.f15977;
    }

    public final void setReleaseBlock(InterfaceC4745 interfaceC4745) {
        this.f15976 = interfaceC4745;
        setRelease(new C0737(this, 3));
    }

    public final void setResetBlock(InterfaceC4745 interfaceC4745) {
        this.f15978 = interfaceC4745;
        setReset(new C0737(this, 4));
    }

    public final void setUpdateBlock(InterfaceC4745 interfaceC4745) {
        this.f15977 = interfaceC4745;
        setUpdate(new C0737(this, 5));
    }

    /* JADX INFO: renamed from: ۦۚ */
    public final void m8220() {
        setSavableRegistryEntry(null);
    }

    public View getViewRoot() {
        return this;
    }
}
