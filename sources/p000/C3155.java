package p000;

import android.os.LocaleList;
import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۦؓؑۧۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3155 extends AbstractC1127 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0850 f10633;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f10634;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3155(ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850, int i) {
        super(0);
        this.f10634 = i;
        this.f10633 = viewTreeObserverOnGlobalLayoutListenerC0850;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        int actionMasked;
        int i = this.f10634;
        ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850 = this.f10633;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) viewTreeObserverOnGlobalLayoutListenerC0850.f3073.getValue();
                bool.getClass();
                return bool;
            case 1:
                LocaleList locales = viewTreeObserverOnGlobalLayoutListenerC0850.getConfiguration().getLocales();
                C1257 c1257 = new C1257(new C3446(locales));
                if (locales.isEmpty()) {
                    c1257 = new C1257(new C3446(LocaleList.getDefault()));
                }
                C3446 c3446 = c1257.f4324;
                int size = c3446.f11452.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(new C0620(c3446.f11452.get(i2)));
                }
                return new C5668(arrayList);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                MotionEvent motionEvent = viewTreeObserverOnGlobalLayoutListenerC0850.f3108;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    viewTreeObserverOnGlobalLayoutListenerC0850.f3062 = SystemClock.uptimeMillis();
                    viewTreeObserverOnGlobalLayoutListenerC0850.post(viewTreeObserverOnGlobalLayoutListenerC0850.f3056);
                }
                return C2358.f7817;
            default:
                viewTreeObserverOnGlobalLayoutListenerC0850.get_viewTreeOwners();
                return null;
        }
    }
}
