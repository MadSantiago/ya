package p000;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: renamed from: ۥؘۚؗٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class InputConnectionC2290 implements InputConnection {

    /* JADX INFO: renamed from: ۥۗ */
    public InputConnectionC4504 f7610;

    /* JADX INFO: renamed from: ۥۣ */
    public final C2932 f7611;

    public InputConnectionC2290(InputConnectionC4504 inputConnectionC4504, C2932 c2932) {
        this.f7611 = c2932;
        this.f7610 = inputConnectionC4504;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        InputConnectionC4504 inputConnectionC4504 = this.f7610;
        if (inputConnectionC4504 != null) {
            return inputConnectionC4504.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        InputConnectionC4504 inputConnectionC4504 = this.f7610;
        if (inputConnectionC4504 != null) {
            return inputConnectionC4504.clearMetaKeyStates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        InputConnectionC4504 inputConnectionC4504 = this.f7610;
        if (inputConnectionC4504 != null) {
            if (inputConnectionC4504 != null) {
                inputConnectionC4504.closeConnection();
                this.f7610 = null;
            }
            this.f7611.mo211(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        InputConnectionC4504 inputConnectionC4504 = this.f7610;
        if (inputConnectionC4504 != null) {
            return inputConnectionC4504.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        InputConnectionC4504 inputConnectionC4504 = this.f7610;
        if (inputConnectionC4504 != null) {
            return inputConnectionC4504.commitContent(inputContentInfo, i, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        InputConnectionC4504 inputConnectionC4504 = this.f7610;
        if (inputConnectionC4504 != null) {
            return inputConnectionC4504.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        InputConnectionC4504 inputConnectionC4504 = this.f7610;
        if (inputConnectionC4504 != null) {
            return inputConnectionC4504.commitText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        InputConnectionC4504 inputConnectionC4504 = this.f7610;
        if (inputConnectionC4504 != null) {
            return inputConnectionC4504.deleteSurroundingText(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        InputConnectionC4504 inputConnectionC4504 = this.f7610;
        if (inputConnectionC4504 != null) {
            return inputConnectionC4504.deleteSurroundingTextInCodePoints(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        InputConnectionC4504 inputConnectionC4504 = this.f7610;
        if (inputConnectionC4504 != null) {
            return inputConnectionC4504.m7833();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        InputConnectionC4504 inputConnectionC4504 = this.f7610;
        if (inputConnectionC4504 != null) {
            return inputConnectionC4504.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        InputConnectionC4504 inputConnectionC4504 = this.f7610;
        if (inputConnectionC4504 != null) {
            return inputConnectionC4504.getCursorCapsMode(i);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        InputConnectionC4504 inputConnectionC4504 = this.f7610;
        if (inputConnectionC4504 != null) {
            return inputConnectionC4504.getExtractedText(extractedTextRequest, i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        InputConnectionC4504 inputConnectionC4504 = this.f7610;
        if (inputConnectionC4504 != null) {
            return inputConnectionC4504.getSelectedText(i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        InputConnectionC4504 inputConnectionC4504 = this.f7610;
        if (inputConnectionC4504 != null) {
            return inputConnectionC4504.getTextAfterCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        InputConnectionC4504 inputConnectionC4504 = this.f7610;
        if (inputConnectionC4504 != null) {
            return inputConnectionC4504.getTextBeforeCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        InputConnectionC4504 inputConnectionC4504 = this.f7610;
        if (inputConnectionC4504 != null) {
            return inputConnectionC4504.performContextMenuAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        InputConnectionC4504 inputConnectionC4504 = this.f7610;
        if (inputConnectionC4504 != null) {
            return inputConnectionC4504.performEditorAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        InputConnectionC4504 inputConnectionC4504 = this.f7610;
        if (inputConnectionC4504 != null) {
            return inputConnectionC4504.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        InputConnectionC4504 inputConnectionC4504 = this.f7610;
        if (inputConnectionC4504 != null) {
            return inputConnectionC4504.requestCursorUpdates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        InputConnectionC4504 inputConnectionC4504 = this.f7610;
        if (inputConnectionC4504 != null) {
            return inputConnectionC4504.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        InputConnectionC4504 inputConnectionC4504 = this.f7610;
        if (inputConnectionC4504 != null) {
            return inputConnectionC4504.setComposingRegion(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        InputConnectionC4504 inputConnectionC4504 = this.f7610;
        if (inputConnectionC4504 != null) {
            return inputConnectionC4504.setComposingText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        InputConnectionC4504 inputConnectionC4504 = this.f7610;
        if (inputConnectionC4504 != null) {
            return inputConnectionC4504.setSelection(i, i2);
        }
        return false;
    }
}
