from . import _
from Plugins.Plugin import PluginDescriptor
from Weather import *
from Search_Id import *

def main(session,**kwargs):
	session.open(MeteoMain)

def Plugins(**kwargs):
	list = [PluginDescriptor(name=_("Yahoo Weather"), description=_("5 Day Weather Forecast"), where = [PluginDescriptor.WHERE_PLUGINMENU, PluginDescriptor.WHERE_EXTENSIONSMENU], icon = "plugin.png", fnc=main)]
	return list

