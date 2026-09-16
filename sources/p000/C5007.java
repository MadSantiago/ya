package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* JADX INFO: renamed from: ۦۣۘؒ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5007 implements InterfaceC3442, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ۥَ */
    public InterfaceC3370 f16574;

    /* JADX INFO: renamed from: ۥْ */
    public MenuC4903 f16575;

    /* JADX INFO: renamed from: ۥٓ */
    public ExpandedMenuView f16576;

    /* JADX INFO: renamed from: ۥٖ */
    public C2085 f16577;

    /* JADX INFO: renamed from: ۦ۟ */
    public LayoutInflater f16578;

    /* JADX INFO: renamed from: ۦۨ */
    public Context f16579;

    public C5007(ContextWrapper contextWrapper) {
        this.f16579 = contextWrapper;
        this.f16578 = LayoutInflater.from(contextWrapper);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f16575.m8299(this.f16577.getItem(i), this, 0);
    }

    @Override // p000.InterfaceC3442
    /* JADX INFO: renamed from: ۥؗ */
    public final boolean mo3726(C1092 c1092) {
        return false;
    }

    @Override // p000.InterfaceC3442
    /* JADX INFO: renamed from: ۥُ */
    public final void mo4534(InterfaceC3370 interfaceC3370) {
        throw null;
    }

    @Override // p000.InterfaceC3442
    /* JADX INFO: renamed from: ۥّ */
    public final boolean mo3728(C1092 c1092) {
        return false;
    }

    @Override // p000.InterfaceC3442
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo4535(MenuC4903 menuC4903, boolean z) {
        InterfaceC3370 interfaceC3370 = this.f16574;
        if (interfaceC3370 != null) {
            interfaceC3370.mo2765(menuC4903, z);
        }
    }

    @Override // p000.InterfaceC3442
    /* JADX INFO: renamed from: ۦِ */
    public final boolean mo4536(SubMenuC4103 subMenuC4103) {
        boolean zHasVisibleItems = subMenuC4103.hasVisibleItems();
        Context context = subMenuC4103.f16182;
        if (!zHasVisibleItems) {
            return false;
        }
        DialogInterfaceOnKeyListenerC2273 dialogInterfaceOnKeyListenerC2273 = new DialogInterfaceOnKeyListenerC2273();
        dialogInterfaceOnKeyListenerC2273.f7549 = subMenuC4103;
        C0322 c0322 = new C0322(context);
        C0859 c0859 = (C0859) c0322.f1178;
        C5007 c5007 = new C5007(c0859.f3173);
        dialogInterfaceOnKeyListenerC2273.f7547 = c5007;
        c5007.f16574 = dialogInterfaceOnKeyListenerC2273;
        subMenuC4103.m8303(c5007, context);
        C5007 c5008 = dialogInterfaceOnKeyListenerC2273.f7547;
        C2085 c2085 = c5008.f16577;
        if (c2085 == null) {
            c2085 = new C2085(c5008);
            c5008.f16577 = c2085;
        }
        c0859.f3177 = c2085;
        c0859.f3172 = dialogInterfaceOnKeyListenerC2273;
        View view = subMenuC4103.f16195;
        if (view != null) {
            c0859.f3169 = view;
        } else {
            c0859.f3168 = subMenuC4103.f16192;
            c0859.f3174 = subMenuC4103.f16185;
        }
        c0859.f3170 = dialogInterfaceOnKeyListenerC2273;
        DialogInterfaceC4964 dialogInterfaceC4964M703 = c0322.m703();
        dialogInterfaceOnKeyListenerC2273.f7548 = dialogInterfaceC4964M703;
        dialogInterfaceC4964M703.setOnDismissListener(dialogInterfaceOnKeyListenerC2273);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC2273.f7548.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC2273.f7548.show();
        InterfaceC3370 interfaceC3370 = this.f16574;
        if (interfaceC3370 == null) {
            return true;
        }
        interfaceC3370.mo2761(subMenuC4103);
        return true;
    }

    @Override // p000.InterfaceC3442
    /* JADX INFO: renamed from: ۦٛ */
    public final void mo3733(Context context, MenuC4903 menuC4903) {
        if (this.f16579 != null) {
            this.f16579 = context;
            if (this.f16578 == null) {
                this.f16578 = LayoutInflater.from(context);
            }
        }
        this.f16575 = menuC4903;
        C2085 c2085 = this.f16577;
        if (c2085 != null) {
            c2085.notifyDataSetChanged();
        }
    }

    @Override // p000.InterfaceC3442
    /* JADX INFO: renamed from: ۦۗ */
    public final boolean mo4537() {
        return false;
    }

    @Override // p000.InterfaceC3442
    /* JADX INFO: renamed from: ۦۙ */
    public final void mo4538() {
        C2085 c2085 = this.f16577;
        if (c2085 != null) {
            c2085.notifyDataSetChanged();
        }
    }
}
