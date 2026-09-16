package p000;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۥّۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class InputConnectionC1187 implements InputConnection {

    /* JADX INFO: renamed from: ۥؗ */
    public int f4076;

    /* JADX INFO: renamed from: ۥُ */
    public int f4077;

    /* JADX INFO: renamed from: ۥّ */
    public boolean f4078;

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean f4079;

    /* JADX INFO: renamed from: ۥۣ */
    public final C3121 f4081;

    /* JADX INFO: renamed from: ۦؑ */
    public C5745 f4082;

    /* JADX INFO: renamed from: ۦۙ */
    public final ArrayList f4083 = new ArrayList();

    /* JADX INFO: renamed from: ۥۜ */
    public boolean f4080 = true;

    public InputConnectionC1187(C5745 c5745, C3121 c3121, boolean z) {
        this.f4081 = c3121;
        this.f4079 = z;
        this.f4082 = c5745;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.f4080;
        if (!z) {
            return z;
        }
        this.f4076++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.f4080;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f4083.clear();
        this.f4076 = 0;
        this.f4080 = false;
        ArrayList arrayList = ((C2240) this.f4081.f10451).f7424;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (AbstractC3831.m6874(((WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.f4080;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.f4080;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.f4080;
        return z ? this.f4079 : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.f4080;
        if (z) {
            m2507(new C1472(i, String.valueOf(charSequence)));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.f4080;
        if (!z) {
            return z;
        }
        m2507(new C0351(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.f4080;
        if (!z) {
            return z;
        }
        m2507(new C3994(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return m2506();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.f4080;
        if (!z) {
            return z;
        }
        m2507(new C4826());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        C5745 c5745 = this.f4082;
        return TextUtils.getCapsMode(c5745.f18944.f4307, C3346.m6109(c5745.f18943), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.f4078 = z;
        if (z) {
            this.f4077 = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return C4773.m8156(this.f4082);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (C3346.m6107(this.f4082.f18943)) {
            return null;
        }
        return C4773.m8119(this.f4082).f4307;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return C4773.m8117(this.f4082, i).f4307;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return C4773.m8136(this.f4082, i).f4307;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.f4080;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    m2507(new C2890(0, this.f4082.f18944.f4307.length()));
                    break;
                case R.id.cut:
                    m2505(277);
                    return false;
                case R.id.copy:
                    m2505(278);
                    return false;
                case R.id.paste:
                    m2505(279);
                    return false;
                default:
                    return false;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        boolean z = this.f4080;
        if (z) {
            z = true;
            if (i != 0) {
                switch (i) {
                    case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                        i2 = 2;
                        break;
                    case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                        i2 = 3;
                        break;
                    case C4261.LONG_FIELD_NUMBER /* 4 */:
                        i2 = 4;
                        break;
                    case C4261.STRING_FIELD_NUMBER /* 5 */:
                        i2 = 6;
                        break;
                    case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                        i2 = 7;
                        break;
                    case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                        i2 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
                        i2 = 1;
                        break;
                }
            } else {
                i2 = 1;
            }
            ((C2240) this.f4081.f10451).f7416.mo211(new C0221(i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.f4080;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0065 A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:44:0x005b, B:46:0x0065, B:48:0x006b, B:51:0x0071), top: B:57:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:48:0x006b A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:44:0x005b, B:46:0x0065, B:48:0x006b, B:51:0x0071), top: B:57:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:57:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        C2541 c2541;
        boolean z4 = this.f4080;
        if (!z4) {
            return z4;
        }
        boolean z5 = false;
        boolean z6 = (i & 1) != 0;
        boolean z7 = (i & 2) != 0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            z2 = (i & 16) != 0;
            z3 = (i & 8) != 0;
            boolean z8 = (i & 4) != 0;
            if (i2 >= 34 && (i & 32) != 0) {
                z5 = true;
            }
            if (z2 || z3 || z8 || z5) {
                z = z5;
                z5 = z8;
            } else {
                if (i2 >= 34) {
                    z = true;
                    z5 = true;
                } else {
                    z = z5;
                    z5 = true;
                }
                z2 = z5;
            }
            c2541 = ((C2240) this.f4081.f10451).f7421;
            synchronized (c2541.f8469) {
                try {
                    c2541.f8471 = z2;
                    c2541.f8483 = z3;
                    c2541.f8475 = z5;
                    c2541.f8481 = z;
                    if (z6) {
                        c2541.f8470 = true;
                        if (c2541.f8480 != null) {
                            c2541.m4770();
                        }
                    }
                    c2541.f8477 = z7;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        z = false;
        z2 = true;
        z3 = z2;
        c2541 = ((C2240) this.f4081.f10451).f7421;
        synchronized (c2541.f8469) {
            c2541.f8471 = z2;
            c2541.f8483 = z3;
            c2541.f8475 = z5;
            c2541.f8481 = z;
            if (z6) {
                c2541.f8470 = true;
                if (c2541.f8480 != null) {
                    c2541.m4770();
                }
            }
            c2541.f8477 = z7;
            return true;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.f4080;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((C2240) this.f4081.f10451).f7423.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.f4080;
        if (z) {
            m2507(new C4197(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.f4080;
        if (z) {
            m2507(new C4500(i, String.valueOf(charSequence)));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.f4080;
        if (!z) {
            return z;
        }
        m2507(new C2890(i, i2));
        return true;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m2505(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean m2506() {
        int i = this.f4076 - 1;
        this.f4076 = i;
        if (i == 0) {
            ArrayList arrayList = this.f4083;
            if (!arrayList.isEmpty()) {
                ((C2240) this.f4081.f10451).f7415.mo211(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.f4076 > 0;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m2507(InterfaceC1400 interfaceC1400) {
        this.f4076++;
        try {
            this.f4083.add(interfaceC1400);
        } finally {
            m2506();
        }
    }
}
