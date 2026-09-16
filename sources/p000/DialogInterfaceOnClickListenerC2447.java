package p000;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: renamed from: ۥۣ۟ؔ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC2447 implements InterfaceC1012, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ۥْ */
    public CharSequence f8148;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ C3689 f8149;

    /* JADX INFO: renamed from: ۦ۟ */
    public C5316 f8150;

    /* JADX INFO: renamed from: ۦۨ */
    public DialogInterfaceC4964 f8151;

    public DialogInterfaceOnClickListenerC2447(C3689 c3689) {
        this.f8149 = c3689;
    }

    @Override // p000.InterfaceC1012
    public final void dismiss() {
        DialogInterfaceC4964 dialogInterfaceC4964 = this.f8151;
        if (dialogInterfaceC4964 != null) {
            dialogInterfaceC4964.dismiss();
            this.f8151 = null;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C3689 c3689 = this.f8149;
        c3689.setSelection(i);
        if (c3689.getOnItemClickListener() != null) {
            c3689.performItemClick(null, i, this.f8150.getItemId(i));
        }
        dismiss();
    }

    @Override // p000.InterfaceC1012
    /* JADX INFO: renamed from: ۥؗ */
    public final int mo2221() {
        return 0;
    }

    @Override // p000.InterfaceC1012
    /* JADX INFO: renamed from: ۥُ */
    public final Drawable mo2222() {
        return null;
    }

    @Override // p000.InterfaceC1012
    /* JADX INFO: renamed from: ۥْ */
    public final void mo2104(ListAdapter listAdapter) {
        this.f8150 = (C5316) listAdapter;
    }

    @Override // p000.InterfaceC1012
    /* JADX INFO: renamed from: ۥۗ */
    public final boolean mo2223() {
        DialogInterfaceC4964 dialogInterfaceC4964 = this.f8151;
        if (dialogInterfaceC4964 != null) {
            return dialogInterfaceC4964.isShowing();
        }
        return false;
    }

    @Override // p000.InterfaceC1012
    /* JADX INFO: renamed from: ۦؚ */
    public final void mo2224(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // p000.InterfaceC1012
    /* JADX INFO: renamed from: ۦٌ */
    public final void mo2225(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // p000.InterfaceC1012
    /* JADX INFO: renamed from: ۦٛ */
    public final void mo2226(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // p000.InterfaceC1012
    /* JADX INFO: renamed from: ۦۗ */
    public final void mo2227(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // p000.InterfaceC1012
    /* JADX INFO: renamed from: ۦۙ */
    public final void mo2228(CharSequence charSequence) {
        this.f8148 = charSequence;
    }

    @Override // p000.InterfaceC1012
    /* JADX INFO: renamed from: ۦۚ */
    public final void mo2229(int i, int i2) {
        if (this.f8150 == null) {
            return;
        }
        C3689 c3689 = this.f8149;
        C0322 c0322 = new C0322(c3689.getPopupContext());
        C0859 c0859 = (C0859) c0322.f1178;
        CharSequence charSequence = this.f8148;
        if (charSequence != null) {
            c0859.f3174 = charSequence;
        }
        C5316 c5316 = this.f8150;
        int selectedItemPosition = c3689.getSelectedItemPosition();
        c0859.f3177 = c5316;
        c0859.f3172 = this;
        c0859.f3175 = selectedItemPosition;
        c0859.f3176 = true;
        DialogInterfaceC4964 dialogInterfaceC4964M703 = c0322.m703();
        this.f8151 = dialogInterfaceC4964M703;
        AlertController$RecycleListView alertController$RecycleListView = dialogInterfaceC4964M703.f16417.f16003;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.f8151.show();
    }

    @Override // p000.InterfaceC1012
    /* JADX INFO: renamed from: ۦ۟ */
    public final CharSequence mo2230() {
        return this.f8148;
    }

    @Override // p000.InterfaceC1012
    /* JADX INFO: renamed from: ۦۨ */
    public final int mo2231() {
        return 0;
    }
}
