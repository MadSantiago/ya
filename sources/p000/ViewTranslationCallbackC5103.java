package p000;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* JADX INFO: renamed from: ۦؚۙؔٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTranslationCallbackC5103 implements ViewTranslationCallback {

    /* JADX INFO: renamed from: ۥۣ */
    public static final ViewTranslationCallbackC5103 f16942 = new ViewTranslationCallbackC5103();

    /* JADX WARN: Code duplicated, block: B:26:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0078 A[LOOP:0: B:5:0x0018->B:27:0x0078, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x007b A[EDGE_INSN: B:30:0x007b->B:28:0x007b BREAK  A[LOOP:0: B:5:0x0018->B:27:0x0078], SYNTHETIC] */
    public final boolean onClearTranslation(View view) {
        InterfaceC4448 interfaceC4448;
        ViewOnAttachStateChangeListenerC4316 contentCaptureManager$ui = ((ViewTreeObserverOnGlobalLayoutListenerC0850) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.f14265 = 1;
        AbstractC5746 abstractC5746M7610 = contentCaptureManager$ui.m7610();
        Object[] objArr = abstractC5746M7610.f18945;
        long[] jArr = abstractC5746M7610.f18948;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            C3262 c3262 = ((C1307) objArr[(i << 3) + i3]).f4492.f10476.f8490;
                            Object objM6027 = c3262.m6027(AbstractC2771.f9204);
                            if (objM6027 == null) {
                                objM6027 = null;
                            }
                            if (objM6027 != null) {
                                Object objM6028 = c3262.m6027(AbstractC0208.f785);
                                C0078 c0078 = (C0078) (objM6028 != null ? objM6028 : null);
                                if (c0078 != null && (interfaceC4448 = (InterfaceC4448) c0078.f14720) != null) {
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0080 A[LOOP:0: B:5:0x0018->B:28:0x0080, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0083 A[EDGE_INSN: B:31:0x0083->B:29:0x0083 BREAK  A[LOOP:0: B:5:0x0018->B:28:0x0080], SYNTHETIC] */
    public final boolean onHideTranslation(View view) {
        InterfaceC4745 interfaceC4745;
        ViewOnAttachStateChangeListenerC4316 contentCaptureManager$ui = ((ViewTreeObserverOnGlobalLayoutListenerC0850) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.f14265 = 1;
        AbstractC5746 abstractC5746M7610 = contentCaptureManager$ui.m7610();
        Object[] objArr = abstractC5746M7610.f18945;
        long[] jArr = abstractC5746M7610.f18948;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            C3262 c3262 = ((C1307) objArr[(i << 3) + i3]).f4492.f10476.f8490;
                            Object objM6027 = c3262.m6027(AbstractC2771.f9204);
                            if (objM6027 == null) {
                                objM6027 = null;
                            }
                            if (AbstractC3831.m6874(objM6027, Boolean.TRUE)) {
                                Object objM6028 = c3262.m6027(AbstractC0208.f778);
                                C0078 c0078 = (C0078) (objM6028 != null ? objM6028 : null);
                                if (c0078 != null && (interfaceC4745 = (InterfaceC4745) c0078.f14720) != null) {
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return true;
    }

    public final boolean onShowTranslation(View view) {
        InterfaceC4745 interfaceC4745;
        ViewOnAttachStateChangeListenerC4316 contentCaptureManager$ui = ((ViewTreeObserverOnGlobalLayoutListenerC0850) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.f14265 = 2;
        AbstractC5746 abstractC5746M7610 = contentCaptureManager$ui.m7610();
        Object[] objArr = abstractC5746M7610.f18945;
        long[] jArr = abstractC5746M7610.f18948;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        C3262 c3262 = ((C1307) objArr[(i << 3) + i3]).f4492.f10476.f8490;
                        Object objM6027 = c3262.m6027(AbstractC2771.f9204);
                        if (objM6027 == null) {
                            objM6027 = null;
                        }
                        if (AbstractC3831.m6874(objM6027, Boolean.FALSE)) {
                            Object objM6028 = c3262.m6027(AbstractC0208.f778);
                            C0078 c0078 = (C0078) (objM6028 != null ? objM6028 : null);
                            if (c0078 != null && (interfaceC4745 = (InterfaceC4745) c0078.f14720) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }
}
