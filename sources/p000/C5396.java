package p000;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۦّ۠ؔۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5396 extends EditText implements InterfaceC4062 {

    /* JADX INFO: renamed from: ۥَ */
    public final C5002 f17823;

    /* JADX INFO: renamed from: ۥْ */
    public final C5002 f17824;

    /* JADX INFO: renamed from: ۥٓ */
    public final C5840 f17825;

    /* JADX INFO: renamed from: ۥٖ */
    public C3789 f17826;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C5350 f17827;

    /* JADX INFO: renamed from: ۦۨ */
    public final C2186 f17828;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5396(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        AbstractC2720.m5070(context);
        AbstractC5216.m8834(this, getContext());
        C2186 c2186 = new C2186(this);
        this.f17828 = c2186;
        c2186.m4251(attributeSet, R.attr.editTextStyle);
        C5350 c5350 = new C5350(this);
        this.f17827 = c5350;
        c5350.m8938(attributeSet, R.attr.editTextStyle);
        c5350.m8939();
        C5002 c5002 = new C5002(9, false);
        c5002.f16551 = this;
        this.f17824 = c5002;
        this.f17825 = new C5840();
        C5002 c5003 = new C5002(this, 8);
        this.f17823 = c5003;
        c5003.mo5327(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerM8393 = c5003.m8393(keyListener);
        if (keyListenerM8393 == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM8393);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
    }

    private C3789 getSuperCaller() {
        C3789 c3789 = this.f17826;
        if (c3789 != null) {
            return c3789;
        }
        C3789 c37810 = new C3789(this);
        this.f17826 = c37810;
        return c37810;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2186 c2186 = this.f17828;
        if (c2186 != null) {
            c2186.m4253();
        }
        C5350 c5350 = this.f17827;
        if (c5350 != null) {
            c5350.m8939();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof ActionModeCallbackC5077 ? ((ActionModeCallbackC5077) customSelectionActionModeCallback).f16838 : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2186 c2186 = this.f17828;
        if (c2186 != null) {
            return c2186.m4252();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2186 c2186 = this.f17828;
        if (c2186 != null) {
            return c2186.m4254();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f17827.m8942();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f17827.m8937();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C5002 c5002;
        if (Build.VERSION.SDK_INT >= 28 || (c5002 = this.f17824) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c5002.f16550;
        return textClassifier == null ? AbstractC0899.m1885((TextView) c5002.f16551) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrM6429;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f17827.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && inputConnectionOnCreateInputConnection != null) {
            AbstractC0487.m1062(editorInfo, getText());
        }
        AbstractC2164.m4200(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionOnCreateInputConnection != null && i <= 30 && (strArrM6429 = AbstractC3608.m6429(this)) != null) {
            editorInfo.contentMimeTypes = strArrM6429;
            inputConnectionOnCreateInputConnection = new C2657(inputConnectionOnCreateInputConnection, new C5322(6, this));
        }
        return this.f17823.m8414(inputConnectionOnCreateInputConnection);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean zM4421 = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && AbstractC3608.m6429(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zM4421 = AbstractC2348.m4421(dragEvent, this, activity);
            }
        }
        if (zM4421) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        C0384 c0384;
        InterfaceC2142 interfaceC2142;
        C5086 c5086;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || AbstractC3608.m6429(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            int i3 = 0;
            if (i2 >= 31) {
                c5086 = new C5086(primaryClip, 1);
            } else {
                c0384 = new C0384(i3);
                c0384.f1432 = primaryClip;
                c0384.f1429 = 1;
            }
            if (i != 16908322) {
                interfaceC2142 = c0384;
                interfaceC2142 = c5086;
                i3 = 1;
            }
            interfaceC2142 = c0384;
            interfaceC2142 = c5086;
            interfaceC2142.mo845(i3);
            AbstractC3608.m6431(this, interfaceC2142.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2186 c2186 = this.f17828;
        if (c2186 != null) {
            c2186.m4258();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2186 c2186 = this.f17828;
        if (c2186 != null) {
            c2186.m4257(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5350 c5350 = this.f17827;
        if (c5350 != null) {
            c5350.m8939();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5350 c5350 = this.f17827;
        if (c5350 != null) {
            c5350.m8939();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC4554.m7914(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f17823.m8407(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f17823.m8393(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2186 c2186 = this.f17828;
        if (c2186 != null) {
            c2186.m4244(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2186 c2186 = this.f17828;
        if (c2186 != null) {
            c2186.m4240(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C5350 c5350 = this.f17827;
        c5350.m8947(colorStateList);
        c5350.m8939();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C5350 c5350 = this.f17827;
        c5350.m8943(mode);
        c5350.m8939();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C5350 c5350 = this.f17827;
        if (c5350 != null) {
            c5350.m8948(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C5002 c5002;
        if (Build.VERSION.SDK_INT >= 28 || (c5002 = this.f17824) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c5002.f16550 = textClassifier;
        }
    }

    @Override // p000.InterfaceC4062
    /* JADX INFO: renamed from: ۥۣ */
    public final C5336 mo7254(C5336 c5336) {
        this.f17825.getClass();
        return C5840.m9649(this, c5336);
    }
}
