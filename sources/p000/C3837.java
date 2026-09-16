package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: ۦٌَؓؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3837 extends MenuInflater {

    /* JADX INFO: renamed from: ۥُ */
    public static final Class[] f12777;

    /* JADX INFO: renamed from: ۥّ */
    public static final Class[] f12778;

    /* JADX INFO: renamed from: ۥؗ */
    public final Context f12779;

    /* JADX INFO: renamed from: ۥۗ */
    public final Object[] f12780;

    /* JADX INFO: renamed from: ۥۣ */
    public final Object[] f12781;

    /* JADX INFO: renamed from: ۦؑ */
    public Object f12782;

    static {
        Class[] clsArr = {Context.class};
        f12777 = clsArr;
        f12778 = clsArr;
    }

    public C3837(Context context) {
        super(context);
        this.f12779 = context;
        Object[] objArr = {context};
        this.f12781 = objArr;
        this.f12780 = objArr;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static Object m6884(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m6884(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof MenuC4903)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.f12779.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof MenuC4903) {
                    MenuC4903 menuC4903 = (MenuC4903) menu;
                    if (!menuC4903.f16194) {
                        menuC4903.m8302();
                        z = true;
                    }
                }
                m6885(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((MenuC4903) menu).m8310();
                }
                layout.close();
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (z) {
                ((MenuC4903) menu).m8310();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m6885(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        ColorStateList colorStateList;
        int resourceId;
        C3878 c3878 = new C3878(this, menu);
        int eventType = xmlPullParser.getEventType();
        do {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
                break;
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            Menu menu2 = c3878.f12946;
            if (eventType == i) {
                if (!z2) {
                    String name2 = xmlPullParser.getName();
                    boolean zEquals = name2.equals("group");
                    Context context = this.f12779;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC5618.f18532);
                        c3878.f12944 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        c3878.f12933 = typedArrayObtainStyledAttributes.getInt(3, 0);
                        c3878.f12948 = typedArrayObtainStyledAttributes.getInt(4, 0);
                        c3878.f12936 = typedArrayObtainStyledAttributes.getInt(5, 0);
                        c3878.f12937 = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        c3878.f12957 = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else if (name2.equals("item")) {
                        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC5618.f18513);
                        c3878.f12955 = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                        c3878.f12951 = (typedArrayObtainStyledAttributes2.getInt(5, c3878.f12933) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, c3878.f12948) & 65535);
                        c3878.f12956 = typedArrayObtainStyledAttributes2.getText(7);
                        c3878.f12949 = typedArrayObtainStyledAttributes2.getText(8);
                        c3878.f12950 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                        String string = typedArrayObtainStyledAttributes2.getString(9);
                        c3878.f12958 = string == null ? (char) 0 : string.charAt(0);
                        c3878.f12961 = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                        String string2 = typedArrayObtainStyledAttributes2.getString(10);
                        c3878.f12960 = string2 == null ? (char) 0 : string2.charAt(0);
                        c3878.f12938 = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                        if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                            c3878.f12939 = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                        } else {
                            c3878.f12939 = c3878.f12936;
                        }
                        c3878.f12935 = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                        c3878.f12941 = typedArrayObtainStyledAttributes2.getBoolean(4, c3878.f12937);
                        c3878.f12953 = typedArrayObtainStyledAttributes2.getBoolean(1, c3878.f12957);
                        c3878.f12959 = typedArrayObtainStyledAttributes2.getInt(21, -1);
                        c3878.f12942 = typedArrayObtainStyledAttributes2.getString(12);
                        c3878.f12943 = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                        c3878.f12952 = typedArrayObtainStyledAttributes2.getString(15);
                        String string3 = typedArrayObtainStyledAttributes2.getString(14);
                        boolean z3 = string3 != null;
                        if (z3 && c3878.f12943 == 0 && c3878.f12952 == null) {
                            c3878.f12932 = (ActionProviderVisibilityListenerC2187) c3878.m6930(string3, f12778, this.f12780);
                        } else {
                            if (z3) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            c3878.f12932 = null;
                        }
                        c3878.f12931 = typedArrayObtainStyledAttributes2.getText(17);
                        c3878.f12947 = typedArrayObtainStyledAttributes2.getText(22);
                        if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                            c3878.f12954 = AbstractC3522.m6315(typedArrayObtainStyledAttributes2.getInt(19, -1), c3878.f12954);
                        } else {
                            c3878.f12954 = null;
                        }
                        if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                            if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = AbstractC4225.m7481(context, resourceId)) == null) {
                                colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                            }
                            c3878.f12934 = colorStateList;
                        } else {
                            c3878.f12934 = null;
                        }
                        typedArrayObtainStyledAttributes2.recycle();
                        c3878.f12945 = false;
                        xmlPullParser = xmlPullParser;
                    } else if (name2.equals("menu")) {
                        c3878.f12945 = true;
                        SubMenu subMenuAddSubMenu = menu2.addSubMenu(c3878.f12944, c3878.f12955, c3878.f12951, c3878.f12956);
                        c3878.m6929(subMenuAddSubMenu.getItem());
                        xmlPullParser = xmlPullParser;
                        m6885(xmlPullParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        xmlPullParser = xmlPullParser;
                        str = name2;
                        z2 = true;
                    }
                }
                z = z;
            } else if (eventType != 3) {
                z = z;
            } else {
                String name3 = xmlPullParser.getName();
                if (z2 && name3.equals(str)) {
                    xmlPullParser = xmlPullParser;
                    z2 = false;
                    str = null;
                } else {
                    if (name3.equals("group")) {
                        c3878.f12944 = 0;
                        c3878.f12933 = 0;
                        c3878.f12948 = 0;
                        c3878.f12936 = 0;
                        c3878.f12937 = true;
                        c3878.f12957 = true;
                    } else if (name3.equals("item")) {
                        if (!c3878.f12945) {
                            ActionProviderVisibilityListenerC2187 actionProviderVisibilityListenerC2187 = c3878.f12932;
                            if (actionProviderVisibilityListenerC2187 == null || !actionProviderVisibilityListenerC2187.f7252.hasSubMenu()) {
                                c3878.f12945 = true;
                                c3878.m6929(menu2.add(c3878.f12944, c3878.f12955, c3878.f12951, c3878.f12956));
                            } else {
                                c3878.f12945 = true;
                                c3878.m6929(menu2.addSubMenu(c3878.f12944, c3878.f12955, c3878.f12951, c3878.f12956).getItem());
                            }
                        }
                    } else if (name3.equals("menu")) {
                        z = true;
                    }
                    z = z;
                }
            }
            eventType = xmlPullParser.next();
            i = 2;
            z = z;
            z2 = z2;
        }
    }
}
