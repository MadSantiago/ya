package p000;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۥِۗؖؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC2120 extends AbstractComponentCallbacksC0308 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ۥؕ */
    public boolean f6960;

    /* JADX INFO: renamed from: ۥٌ */
    public boolean f6961;

    /* JADX INFO: renamed from: ۥٍ */
    public int f6962;

    /* JADX INFO: renamed from: ۥٗ */
    public boolean f6963;

    /* JADX INFO: renamed from: ۥٚ */
    public boolean f6964;

    /* JADX INFO: renamed from: ۥٞ */
    public int f6965;

    /* JADX INFO: renamed from: ۥۚ */
    public boolean f6966;

    /* JADX INFO: renamed from: ۦؓ */
    public boolean f6967;

    /* JADX INFO: renamed from: ۦَ */
    public Dialog f6968;

    /* JADX INFO: renamed from: ۦٝ */
    public final DialogInterfaceOnCancelListenerC0418 f6969;

    /* JADX INFO: renamed from: ۦٞ */
    public final DialogInterfaceOnDismissListenerC2093 f6970;

    /* JADX INFO: renamed from: ۦٟ */
    public int f6971;

    /* JADX INFO: renamed from: ۦۢ */
    public boolean f6972;

    /* JADX INFO: renamed from: ۦۤ */
    public final C5086 f6973;

    public DialogInterfaceOnCancelListenerC2120() {
        new RunnableC3365(4, this);
        this.f6969 = new DialogInterfaceOnCancelListenerC0418(this);
        this.f6970 = new DialogInterfaceOnDismissListenerC2093(this);
        this.f6965 = 0;
        this.f6971 = 0;
        this.f6960 = true;
        this.f6967 = true;
        this.f6962 = -1;
        this.f6973 = new C5086(20, this);
        this.f6963 = false;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.f6972) {
            return;
        }
        if (C2790.m5261(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f6961) {
            return;
        }
        this.f6961 = true;
        this.f6966 = false;
        Dialog dialog = this.f6968;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f6968.dismiss();
        }
        this.f6972 = true;
        if (this.f6962 >= 0) {
            C2790 c2790M657 = m657();
            int i = this.f6962;
            if (i < 0) {
                C1078.m2272(AbstractC5078.m8670(i, "Bad id: "));
                return;
            } else {
                c2790M657.m5279(new C1836(c2790M657, i), true);
                this.f6962 = -1;
                return;
            }
        }
        C2177 c2177 = new C2177(m657());
        c2177.f7201 = true;
        C2790 c2790 = this.f1141;
        if (c2790 == null || c2790 == c2177.f7187) {
            c2177.m4232(new C4088(3, this));
            c2177.m4230(true, true);
        } else {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
    }

    /* JADX INFO: renamed from: ۥؓ */
    public Dialog mo4102() {
        if (C2790.m5261(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new DialogC2438(m646(), this.f6971);
    }

    @Override // p000.AbstractComponentCallbacksC0308
    /* JADX INFO: renamed from: ۥَ */
    public final void mo641() {
        this.f1139 = true;
        if (!this.f6966 && !this.f6961) {
            this.f6961 = true;
        }
        C3543 c3543 = this.f1119;
        c3543.getClass();
        C3543.m6343("removeObserver");
        C4930 c4930 = (C4930) c3543.f11765.mo7718(this.f6973);
        if (c4930 == null) {
            return;
        }
        c4930.m8321(false);
    }

    @Override // p000.AbstractComponentCallbacksC0308
    /* JADX INFO: renamed from: ۥْ */
    public final void mo643(Bundle bundle) {
        Bundle bundle2;
        this.f1139 = true;
        Bundle bundle3 = this.f1151;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.f1142.m5287(bundle2);
            C2790 c2790 = this.f1142;
            c2790.f9317 = false;
            c2790.f9314 = false;
            c2790.f9335.f1249 = false;
            c2790.m5305(1);
        }
        C2790 c2791 = this.f1142;
        if (c2791.f9332 < 1) {
            c2791.f9317 = false;
            c2791.f9314 = false;
            c2791.f9335.f1249 = false;
            c2791.m5305(1);
        }
        new Handler();
        this.f6967 = this.f1113 == 0;
        if (bundle != null) {
            this.f6965 = bundle.getInt("android:style", 0);
            this.f6971 = bundle.getInt("android:theme", 0);
            this.f6960 = bundle.getBoolean("android:cancelable", true);
            this.f6967 = bundle.getBoolean("android:showsDialog", this.f6967);
            this.f6962 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // p000.AbstractComponentCallbacksC0308
    /* JADX INFO: renamed from: ۥٓ */
    public final void mo644() {
        this.f1139 = true;
        Dialog dialog = this.f6968;
        if (dialog != null) {
            this.f6972 = true;
            dialog.setOnDismissListener(null);
            this.f6968.dismiss();
            if (!this.f6961) {
                onDismiss(this.f6968);
            }
            this.f6968 = null;
            this.f6963 = false;
        }
    }

    @Override // p000.AbstractComponentCallbacksC0308
    /* JADX INFO: renamed from: ۥٖ */
    public final LayoutInflater mo645(Bundle bundle) {
        LayoutInflater layoutInflaterMo645 = super.mo645(bundle);
        boolean z = this.f6967;
        if (z && !this.f6964) {
            if (z && !this.f6963) {
                try {
                    this.f6964 = true;
                    Dialog dialogMo4102 = mo4102();
                    this.f6968 = dialogMo4102;
                    AbstractActivityC2747 abstractActivityC2747 = null;
                    if (this.f6967) {
                        int i = this.f6965;
                        if (i == 1 || i == 2) {
                            dialogMo4102.requestWindowFeature(1);
                        } else if (i == 3) {
                            Window window = dialogMo4102.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                            }
                            dialogMo4102.requestWindowFeature(1);
                        }
                        C0827 c0827 = this.f1136;
                        if (c0827 != null) {
                            abstractActivityC2747 = c0827.f2924;
                        }
                        if (abstractActivityC2747 != null) {
                            this.f6968.setOwnerActivity(abstractActivityC2747);
                        }
                        this.f6968.setCancelable(this.f6960);
                        this.f6968.setOnCancelListener(this.f6969);
                        this.f6968.setOnDismissListener(this.f6970);
                        this.f6963 = true;
                    } else {
                        this.f6968 = null;
                    }
                    this.f6964 = false;
                } catch (Throwable th) {
                    this.f6964 = false;
                    throw th;
                }
            }
            if (C2790.m5261(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f6968;
            if (dialog != null) {
                return layoutInflaterMo645.cloneInContext(dialog.getContext());
            }
        } else if (C2790.m5261(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f6967) {
                Log.d("FragmentManager", "mShowsDialog = false: ".concat(str));
                return layoutInflaterMo645;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: ".concat(str));
        }
        return layoutInflaterMo645;
    }

    @Override // p000.AbstractComponentCallbacksC0308
    /* JADX INFO: renamed from: ۥۖ */
    public final void mo647() {
        this.f1139 = true;
        Dialog dialog = this.f6968;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // p000.AbstractComponentCallbacksC0308
    /* JADX INFO: renamed from: ۥۣ */
    public final AbstractC0993 mo650() {
        return new C0598(this, new C0598(this));
    }

    @Override // p000.AbstractComponentCallbacksC0308
    /* JADX INFO: renamed from: ۦٕ */
    public final void mo655(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.mo655(layoutInflater, viewGroup, bundle);
        if (this.f6968 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f6968.onRestoreInstanceState(bundle2);
    }

    @Override // p000.AbstractComponentCallbacksC0308
    /* JADX INFO: renamed from: ۦٗ */
    public final void mo656(Bundle bundle) {
        Dialog dialog = this.f6968;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.f6965;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f6971;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f6960;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f6967;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f6962;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // p000.AbstractComponentCallbacksC0308
    /* JADX INFO: renamed from: ۦۚ */
    public final void mo660() {
        this.f1139 = true;
    }

    @Override // p000.AbstractComponentCallbacksC0308
    /* JADX INFO: renamed from: ۦۛ */
    public final void mo661() {
        this.f1139 = true;
        Dialog dialog = this.f6968;
        if (dialog != null) {
            this.f6972 = false;
            dialog.show();
            View decorView = this.f6968.getWindow().getDecorView();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // p000.AbstractComponentCallbacksC0308
    /* JADX INFO: renamed from: ۦ۟ */
    public final void mo662(AbstractActivityC2747 abstractActivityC2747) {
        Object obj;
        super.mo662(abstractActivityC2747);
        C3543 c3543 = this.f1119;
        c3543.getClass();
        C3543.m6343("observeForever");
        C5086 c5086 = this.f6973;
        C4930 c4930 = new C4930(c3543, c5086);
        C4418 c4418 = c3543.f11765;
        C2985 c2985Mo7717 = c4418.mo7717(c5086);
        if (c2985Mo7717 != null) {
            obj = c2985Mo7717.f10039;
        } else {
            C2985 c2985 = new C2985(c5086, c4930);
            c4418.f14566++;
            C2985 c2986 = c4418.f14567;
            if (c2986 == null) {
                c4418.f14568 = c2985;
                c4418.f14567 = c2985;
            } else {
                c2986.f10037 = c2985;
                c2985.f10038 = c2986;
                c4418.f14567 = c2985;
            }
            obj = null;
        }
        if (((C4930) obj) == null) {
            c4930.m8321(true);
        }
        if (this.f6966) {
            return;
        }
        this.f6961 = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
